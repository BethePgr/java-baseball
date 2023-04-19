package baseball.service;

import baseball.domain.BaseBall;
import baseball.domain.BaseBallResult;


public class BaseBallService {

    private BaseBall baseBall;

    public BaseBallService() {
        this.baseBall = new BaseBall();
    }

    public BaseBallResult getResult(String input) {
        baseBall.inputToList(input);
        return baseBall.getBaseBallResult();
    }

    public boolean checkRestart(String input) {
        return input.equals("1") || input.equals("2");
    }
}
