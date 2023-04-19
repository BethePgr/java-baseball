package baseball.view;

import baseball.domain.BaseBallResult;

public class OutputView {

    private final BaseBallResult baseBallResult;

    public OutputView(BaseBallResult baseBallResult){
        this.baseBallResult = baseBallResult;
    }

    public void printResult(){
        printBall();
        printStrike();
        printBallAndStrike();
        printNothing();
    }

    private void printBall(){
        if(baseBallResult.getBallCount() != 0 && baseBallResult.getStrikeCount() == 0){
            System.out.print(baseBallResult.getBallCount()+"볼");
        }
    }

    private void printStrike(){
        if(baseBallResult.getBallCount() == 0 && baseBallResult.getStrikeCount() !=0){
            System.out.println(baseBallResult.getStrikeCount()+"스트라이크");
        }
    }

    private void printBallAndStrike(){
        if(baseBallResult.getBallCount() != 0 && baseBallResult.getStrikeCount() !=0){
            System.out.println(baseBallResult.getBallCount()+"볼 "+baseBallResult.getStrikeCount()+"스트라이크");
        }
    }

    private void printNothing(){
        if(baseBallResult.getBallCount() == 0 && baseBallResult.getStrikeCount() ==0){
            System.out.println("낫싱");
        }
    }

}
