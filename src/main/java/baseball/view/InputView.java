package baseball.view;

import camp.nextstep.edu.missionutils.Console;

public class InputView {

    private static String INPUT_NUMBER = "숫자를 입력해주세요 : ";
    private static String RESTART_MESSAGE = "게임을 다시 시작하시겠습니까?";
    public static String inputUserNumber(){
        System.out.println(INPUT_NUMBER);
        return Console.readLine();
    }

    public static String inputRestartNumber(){
        System.out.println(RESTART_MESSAGE);
        return Console.readLine();
    }
}
