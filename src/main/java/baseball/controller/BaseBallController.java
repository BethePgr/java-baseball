package baseball.controller;

import baseball.domain.ComputerNumber;
import baseball.domain.GameResult;
import baseball.domain.UserNumber;
import baseball.service.BaseBallService;
import baseball.view.InputView;
import baseball.view.OutputView;
import java.util.List;

public class BaseBallController {

    private BaseBallService baseBallService;

    public BaseBallController() {
        OutputView.printStartMessage();
    }

    public void run() {
        boolean flag = false;
        do {
            this.baseBallService = new BaseBallService();
            runOneCycle();
            OutputView.printClearMessage();
            flag = baseBallService.wantRestart(InputView.inputRestartNumber());
        } while (flag);

    }

    private void runOneCycle() {
        int strikeCount = 0;
        baseBallService.initBaseBallGame();
        while (strikeCount != 3) {
            GameResult gameResult = baseBallService.countBallStrike(InputView.inputUserNumber());
            strikeCount = gameResult.strikeCount;
            new OutputView(gameResult).printResult();
        }
    }

}
