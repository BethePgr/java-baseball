package baseball.view;

import camp.nextstep.edu.missionutils.Console;

public class InputView {

    private static String INPUT_NUMBER = "숫자를 입력해주세요 : ";

    public static String inputUserNumber(){
        System.out.println(INPUT_NUMBER);
        return Console.readLine();
    }

}
