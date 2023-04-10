package baseball.view;

import baseball.domain.GameResult;

public class OutputView {

    private static final String START_MESSAGE = "숫자 야구 게임을 시작합니다.";
    private static final String CLEAR_MESSAGE = "3개의 숫자를 모두 맞히셨습니다!게임 종료";
    private final GameResult gameResult;

    public OutputView(GameResult gameResult) {
        this.gameResult = gameResult;
    }

    public static void printStartMessage() {
        System.out.println(START_MESSAGE);
    }

    public static void printClearMessage() {
        System.out.println(CLEAR_MESSAGE);
    }

    public void printResult() {
        printOnlyBall();
        printOnlyStrike();
        printBallAndStrike();
        printNothing();
    }


    private void printOnlyBall() {
        if (gameResult.ballCount != 0 && gameResult.strikeCount == 0) {
            System.out.println(gameResult.ballCount + "볼");
        }
    }

    private void printOnlyStrike() {
        if (gameResult.ballCount == 0 && gameResult.strikeCount != 0) {
            System.out.println(gameResult.strikeCount + "스트라이크");
        }
    }

    private void printBallAndStrike() {
        if (gameResult.ballCount != 0 && gameResult.strikeCount != 0) {
            System.out.println(gameResult.ballCount + "볼 " + gameResult.strikeCount + "스트라이크");
        }
    }

    private void printNothing() {
        if (gameResult.ballCount == 0 && gameResult.strikeCount == 0) {
            System.out.println("낫싱");
        }
    }


}
