package baseball.controller;

import baseball.domain.BaseBallResult;
import baseball.service.BaseBallService;
import baseball.view.InputView;
import baseball.view.OutputView;

public class BaseBallController {

    private InputView inputView = new InputView();
    private BaseBallService baseBallService;

    public void run() {
        OutputView.printStart();
        String input = "";
        do {
            runOneCycle();
            input = inputView.reStartMessage();
        } while (input.equals("1"));
    }

    public void runOneCycle() {
        baseBallService = new BaseBallService();
        int strikeCount = 0;
        do {
            strikeCount = runOneTime();
        } while (strikeCount != 3);
        OutputView.printEndGame();
    }

    public int runOneTime() {
        String input = inputView.startMessage();
        BaseBallResult result = baseBallService.getResult(input);
        new OutputView(result).printResult();
        return result.getStrikeCount();
    }

}
