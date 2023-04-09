package baseball.domain;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UserNumber {

    private static int NUM_LENGTH = 3;
    private static int START_NUMBER = 1;
    private static int END_NUMBER = 9;
    private static List<Integer> userNumber;

    public UserNumber(String userInput){
        this.userNumber = createUserNums(userInput);
    }

    private List<Integer> createUserNums(String str) throws IllegalArgumentException{
        List<Integer> userNums = convertStringToInt(str);
        if(!checkAll(userNums)){
            throw new IllegalArgumentException();
        }
        return userNums;
    }


    private boolean isDuplicate(List<Integer> userNums){
        return userNums.stream().distinct().count() == NUM_LENGTH;
    }

    private boolean checkValidNumber(List<Integer> userNums){
        return userNums.stream().allMatch(num -> num >=START_NUMBER && num <= END_NUMBER);
    }

    private boolean checkAll(List<Integer> userNums){
        return isDuplicate(userNums) && checkValidNumber(userNums);
    }

    private List<Integer> convertStringToInt(String str){
        int[] ints = str.chars().map(num -> num - '0').toArray();
        return Arrays.stream(ints).boxed().collect(Collectors.toList());
    }

    public List<Integer> getUserNumber(){
        return userNumber;
    }
}
