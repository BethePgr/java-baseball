package baseball.domain;

import baseball.validate.ComputerNumValidate;
import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.List;

public class ComputerNumber {

    private ComputerNumValidate computerNumValidate = new ComputerNumValidate();
    private List<Integer> computerNum;

    public ComputerNumber(){
        CreateDistinctComputerNum();
    }

    private List<Integer> CreateComputerNum(){
        List<Integer> list = new ArrayList<>();
        for(int i = 0;i<3;i++){
            list.add(Randoms.pickNumberInRange(1,9));
        }
        return list;
    }

    public void CreateDistinctComputerNum(){
        List<Integer> tempList = CreateComputerNum();
        if(computerNumValidate.checkAll(tempList)){
            computerNum = tempList;
        }
        if(!computerNumValidate.checkAll(tempList)){
            CreateDistinctComputerNum();
        }
    }

    public List<Integer> getComputerNum(){
        return computerNum;
    }

}
