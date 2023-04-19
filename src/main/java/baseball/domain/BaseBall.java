package baseball.domain;

import java.util.ArrayList;
import java.util.List;

public class BaseBall {

    private final List<Integer> computerNumList;
    private List<Integer> userNumList;
    private BaseBallResult baseBallResult;

    public BaseBall() {
        computerNumList = new ComputerNumber().getComputerNum();
    }

    public void inputToList(String input) {
        userNumList = new ArrayList<>();
        for (int i = 0; i < computerNumList.size(); i++) {
            userNumList.add(input.charAt(i) - '0');
        }
    }

    public BaseBallResult getBaseBallResult() {
        baseBallResult = new BaseBallResult(computerNumList, userNumList);
        return baseBallResult;
    }
}
