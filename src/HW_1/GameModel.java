package HW_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GameModel {
    private int top;
    private int bot;
    private int secretNum;
    private List<Integer> numWay = new ArrayList<Integer>();

    public int getTop() {
        return top;
    }

    public int getBot() {
        return bot;
    }

    public int getSecretNum() {
        return secretNum;
    }

    public List<Integer> getNumWay() {
        return numWay;
    }

    public void setSecretNum() {
        secretNum = (int) (Math.random() * (top - bot) + bot);
    }

    public boolean inputNum(int num) {
        numWay.add(num);
        if (num == secretNum) {
            return false;
        } else if (num > secretNum) {
            top = num - 1;
        } else {
            bot = num + 1;
        }
        return true;
    }

    public void setBotTop(int bot,int top){
        this.bot = bot;
        this.top = top;
    }
}

