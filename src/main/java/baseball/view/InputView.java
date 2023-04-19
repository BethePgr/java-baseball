package baseball.view;

import baseball.validate.InputValidate;
import camp.nextstep.edu.missionutils.Console;
import java.util.Arrays;

public class InputView {

    private static final String INPUT_NUMBER_MESSAGE = "숫자를 입력해주세요 : ";
    private static final String INPUT_RESTART_MESSAGE = "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.";
    private final InputValidate inputValidate = new InputValidate();
    public String startMessage(){
        System.out.print(INPUT_NUMBER_MESSAGE);
        String input = Console.readLine();
        try{
            inputValidate.validateInputNumber(input);
            return input;
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        return null;
    }

    public String reStartMessage(){
        System.out.println(INPUT_RESTART_MESSAGE);
        String input = Console.readLine();
        try{
            inputValidate.validateInputRestart(input);
            return input;
        }catch(IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

}
