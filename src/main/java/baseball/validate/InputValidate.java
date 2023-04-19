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

    public void validateInputRestart(String input){
        if(input.equals("1") || input.equals("2")){
            return;
        }
        throw new IllegalArgumentException("[ERROR] 재시작을 원하는 1이나 종료를 원하는 2밖에 입력이 불가능합니다.");
    }
}
