package baseball.validate;

public class InputValidate {

    public void validateInputNumber(String input) {
        if(validateDistinct(input) && validateSize(input) && validateOnlyNumber(input)){
            return;
        }
        throw new IllegalArgumentException("[ERROR] 중복되지 않은 3자리 숫자만 입력 가능합니다.");
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
}
