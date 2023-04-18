package baseball;

import baseball.controller.BaseBallController;

public class Application {

    private String second = "b";
    private String secon2 = "b";

    public static void main(String[] args) {
        BaseBallController game = new BaseBallController();
        game.run();
    }
}
