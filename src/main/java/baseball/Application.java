package baseball;

import baseball.controller.BaseBallController;

public class Application {

    public static void main(String[] args) {
        BaseBallController bs = new BaseBallController();
        bs.run();
    }
}
