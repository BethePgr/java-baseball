package baseball.validate;

import java.util.List;

public class ComputerNumValidate {


    public boolean checkAll(List<Integer> computerNum){
        return checkDistinctSizeThree(computerNum);
    }

    private boolean checkDistinctSizeThree(List<Integer> computerNum){
        return computerNum.stream().distinct().count() == 3;
    }

}
