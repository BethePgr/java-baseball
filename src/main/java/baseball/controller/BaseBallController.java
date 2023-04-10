package baseball.controller;

import baseball.domain.ComputerNumber;
import baseball.domain.GameResult;
import baseball.domain.UserNumber;
import baseball.view.InputView;
import baseball.view.OutputView;
import java.util.ArrayList;
import java.util.List;

public class BaseBallController {

    public void run(){
        OutputView.printStartMessage();
        boolean flag = false;
        do{
            runOneCycle();
            OutputView.printClearMessage();
            flag = isRestartGame(InputView.inputRestartNumber());
        }while(flag);

    }

    private void runOneCycle(){
        int strikeCount = 0;
        List<Integer> computerNumber = new ComputerNumber().getComputerNumber();
        while(strikeCount != computerNumber.size()) {
            List<Integer> userNumber = new UserNumber(InputView.inputUserNumber()).getUserNumber();
            GameResult gameResult = new GameResult(computerNumber, userNumber);
            strikeCount = gameResult.strikeCount;
            new OutputView(gameResult).printResult();
        }
    }

    private boolean isRestartGame(String str) throws IllegalArgumentException{
        if (str.equals("1")) return true;
        if (str.equals("2")) return false;
        throw new IllegalArgumentException();
    }
}
