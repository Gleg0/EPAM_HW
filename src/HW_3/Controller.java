package HW_3;

import java.util.Scanner;

public class Controller {
    private Model model;
    private View view;

    public Controller(Model model,View view){
        this.model = model;
        this.view = view;
    }

    public String read(String regex,String message){
        boolean flag = true;
        String str = null;
        Scanner sc = new Scanner(System.in);
        while (flag){
            try {
                view.print(message);
                str = sc.next();
                if(!str.matches(regex)){
                    throw new IllegalArgumentException();
                }
                flag = false;
            }catch (IllegalArgumentException ex){
                flag = true;
                view.print(View.WRONG_INPUT_DATA);
            }
        }
        return str;
    }

    public String readNickname() {
        boolean flag = true;
        String str = null;
        while (flag){
            try {
                str = read(view.getRegNickname(),view.getInputNickname());
                model.requireUniqueNickname(str);
                flag = false;
            }catch (IsNotUniqueLogin ex){
                view.print(View.INPUT_WARNING_NOT_UNIQUE_NICKNAME_DATA);
                flag = true;
            }
        }
        return str;
    }

    public void regUser(){
        User user = new User(read(view.getRegName(),view.getInputName()),readNickname());
        try {
            model.saveUser(user);
        } catch (IsNotUniqueLogin e) {
            e.printStackTrace();
        }
    }


    public void processUser(){
        regUser();
        view.print(View.INPUT_REGISTRATION_SUCCESSFUL);
    }

}
