package baseball.domain;

import java.util.List;

public class BaseBall {

    private final List<Integer> computerNum;
    private List<Integer> userNum;
    private GameResult gameResult;

    public BaseBall() {
        this.computerNum = new ComputerNumber().getComputerNumber();
    }

    public void inputUserNum(String input) {
        this.userNum = new UserNumber(input).getUserNumber();
    }

    public void calculateGameResult() {
        this.gameResult = new GameResult(computerNum, userNum);
    }

    public GameResult getGameResult() {
        return this.gameResult;
    }
}
