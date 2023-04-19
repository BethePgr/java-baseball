package baseball.service;

import baseball.domain.BaseBall;
import baseball.domain.BaseBallResult;
import baseball.domain.ComputerNumber;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class BaseBallService {

    private BaseBall baseBall;

    public BaseBallService(){
        this.baseBall = new BaseBall();
    }

    public BaseBallResult getResult(String input){
        baseBall.inputToList(input);
        return baseBall.getBaseBallResult();
    }
}
