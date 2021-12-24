package HW_1;

import java.util.List;

public class GameView {
    public void incorrectInput(){
        System.out.println("Pls, check your number incorrect input.");
    }
    public void correctInput(){
        System.out.println("You are right!");
    }
    public void newAreaMessage(int top,int bot){
        System.out.println("[" + top + "," + bot + "]");
    }
    public void inputMassage(){
        System.out.print("Input INT number ");
    }

    public void yourWay(List<Integer> list){
        System.out.println(list);
    }

}

