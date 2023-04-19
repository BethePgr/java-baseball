package baseball.controller;

import baseball.domain.BaseBallResult;
import baseball.service.BaseBallService;
import baseball.view.OutputView;

public class BaseBallController {

    private InputController inputController = new InputController();
    private BaseBallService baseBallService;

    public void run(){
        String input = "";
        do {
            runOneCycle();
            input = inputController.inputRestart();
        }while(input.equals("1"));

    }

    public void runOneCycle(){
        baseBallService = new BaseBallService();
        int strikeCount = 0;
        do{
            strikeCount = runOneTime();
        }while(strikeCount != 3);
        OutputView.printEndGame();
    }

    public int runOneTime(){
        String input = inputController.inputNum();
        BaseBallResult result = baseBallService.getResult(input);
        new OutputView(result).printResult();
        return result.getStrikeCount();
    }

    public static void main(String[] args) {
        BaseBallController bs = new BaseBallController();
        bs.run();
    }
}
