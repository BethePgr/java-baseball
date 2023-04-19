package baseball.validate;

public class InputValidate {

    public boolean validateInputNumber(String input) {
        if(validateDistinct(input) && validateSize(input) && validateOnlyNumber(input)){
            return true;
        }
        throw new IllegalArgumentException();
    }

    private boolean validateSize(String input){
        return input.length() == 3;
    }

    private boolean validateDistinct(String input){
        return input.chars().distinct().count() ==3;
    }

    private boolean validateOnlyNumber(String input){
        return input.chars().allMatch(num -> num-'0'>=1 && num-'0'<=9);
    }

    public boolean validateInputRestart(String input){
        if(input.equals("1") || input.equals("2")){
            return true;
        }
        throw new IllegalArgumentException();
    }
}
