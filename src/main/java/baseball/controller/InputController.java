package baseball.controller;

import baseball.validate.InputValidate;
import baseball.view.InputView;

public class InputController {

    private final InputView inputView = new InputView();
    private final InputValidate inputValidate = new InputValidate();

    public String inputNum(){
        try{
            String input = inputView.startMessage();
            inputValidate.validateInputNumber(input);
            return input;
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
            return "";
        }
    }

    public String inputRestart(){
        try{
            String input = inputView.reStartMessage();
            inputValidate.validateInputRestart(input);
            return input;
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
            return "";
        }
    }

}
