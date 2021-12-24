package HW_3;

import java.util.ArrayList;

public class Model {

    ArrayList<String> arr = new ArrayList<>();

    public void regUser(User user){
        throw new UnsupportedOperationException();
    }
    public void saveUser(User user) throws IsNotUniqueLogin {
        requireUniqueNickname(user.getNickname());
        arr.add(user.getNickname());
    }

    public void requireUniqueNickname(String nickname) throws IsNotUniqueLogin {
        if(arr.contains(nickname)){
            throw new IsNotUniqueLogin();
        }
    }

}
