package HW_3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller(new Model(),new View());
        controller.processUser();
        controller.processUser();
    }
}
