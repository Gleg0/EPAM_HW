package HW_3;

import java.util.Locale;
import java.util.ResourceBundle;

public class View {
    static public final String INPUT_STRING_DATA = "input.string.data";
    static public final String INPUT_FIRST_NAME_DATA = "input.first.name.data";
    static public final String WRONG_INPUT_DATA = "input.wrong.data";
    static public final String INPUT_NICKNAME_DATA = "input.nickname.data";
    static public final String INPUT_WARNING_NOT_UNIQUE_NICKNAME_DATA = "input.warning.not.unique.nickname.data";
    static public final String INPUT_REGISTRATION_SUCCESSFUL = "registration.successful.data";
    static public final String REG_NAME = "regexp.name.valid";
    static public final String REG_NICKNAME = "regexp.nickname.valid";

    static ResourceBundle resourceBundle = ResourceBundle.getBundle("Language",new Locale("ua"));
    public String getRegName(){
        return resourceBundle.getString(REG_NAME);
    }
    public String getRegNickname(){
        return resourceBundle.getString(REG_NICKNAME);
    }

    public void print(String msg){
        System.out.println(resourceBundle.getString(msg));
    }

    public String getInputName() {
        return INPUT_FIRST_NAME_DATA;
    }

    public String getInputNickname() {
        return INPUT_NICKNAME_DATA;
    }
}
