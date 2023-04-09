package baseball.domain;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ComputerNumberTest {

    @Test
    void 컴퓨터_숫자가_잘_생성되는가() throws Exception{
        for(int i = 0;i<20;i++){
            ComputerNumber computerNumber = new ComputerNumber();
            List<Integer> computerNumbers = computerNumber.getComputerNumber();
            System.out.println(computerNumbers);
            assertEquals(3,computerNumbers.stream().distinct().count());
        }
    }

}