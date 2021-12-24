package HW_1;

import java.util.Scanner;

public class GameController {
    private GameModel model;
    private GameView view;
    public GameController(GameModel model, GameView view){
        this.model = model;
        this.view = view;
    }

    public void game(){
        Scanner sc = new Scanner(System.in);
        model.setBotTop(0,100);
        model.setSecretNum();
        System.out.println(model.getSecretNum());

        while (model.inputNum(checkInputNumber(sc)));

        view.correctInput();
        view.yourWay(model.getNumWay() );
    }

    public int checkInputNumber(Scanner sc){
        int num = 0;
        view.inputMassage();
        view.newAreaMessage(model.getTop(),model.getBot());
        while (true){
            while (!sc.hasNextInt()) {
                view.incorrectInput();
                sc.next();
            }
            if((num = sc.nextInt()) > model.getTop() || model.getBot() > num){
                view.incorrectInput();
                continue;
            }
            break;
        }
        return num;
    }
}
