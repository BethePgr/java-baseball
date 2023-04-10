package baseball.service;

import baseball.domain.BaseBall;
import baseball.domain.GameResult;

public class BaseBallService {

    private BaseBall baseBall;

    public void initBaseBallGame(){
        this.baseBall = new BaseBall();
    }

    public GameResult countBallStrike(String userInput){
        baseBall.inputUserNum(userInput);
        baseBall.calculateGameResult();
        return baseBall.getGameResult();
    }


    public boolean wantRestart(String input){
        if(checkInputNumber(input) && input.equals("1")){
            return true;
        }
        return false;
    }

    private boolean checkInputNumber(String input) throws IllegalArgumentException{
        if(input.equals("1") || input.equals("2")){
            return true;
        }
        throw new IllegalArgumentException();
    }
}
