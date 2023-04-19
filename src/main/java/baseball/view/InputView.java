package baseball.view;

import baseball.validate.InputValidate;
import camp.nextstep.edu.missionutils.Console;
import java.util.Arrays;

public class InputView {

    private static final String INPUT_NUMBER_MESSAGE = "숫자를 입력해주세요 : ";

    public String startMessage(){
        System.out.print(INPUT_NUMBER_MESSAGE);
        return Console.readLine();
    }

}
