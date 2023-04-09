package baseball.domain;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ComputerNumber {

    private static int START_NUM = 1;
    private static int END_NUM = 9;
    private static int NUM_LENGTH = 3;
    private final List<Integer> computerNumber;

    public ComputerNumber(){
        this.computerNumber = createNumber();
    }

    private List<Integer> createNumber(){
        List<Integer> computerNum = createRandom();
        if(!isDuplicate(computerNum)){
            return createNumber();
        }
        return computerNum;
    }


    //3자리 무작위 숫자 생성하는 메서드
    private  List<Integer> createRandom(){
        return Arrays.stream(new List[NUM_LENGTH]).map(num->Randoms.pickNumberInRange(START_NUM,END_NUM)).collect(
            Collectors.toList());
    }

    //3자리 숫자 중 겹치는 숫자가 있다면 false, 모두 겹치지 않는다면 true
    private boolean isDuplicate(List<Integer> createRandom){
        return createRandom.stream().distinct().count() == NUM_LENGTH;
    }

    public List<Integer> getComputerNumber(){
        return computerNumber;
    }
}
