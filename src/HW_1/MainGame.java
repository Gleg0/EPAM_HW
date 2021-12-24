package HW_1;

public class MainGame{
    public static void main(String[] args) {
        GameModel model = new GameModel();
        GameView view = new GameView();
        GameController controller = new GameController(model,view);
        controller.game();
    }
}
