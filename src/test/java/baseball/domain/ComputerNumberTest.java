package baseball.domain;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ComputerNumberTest {

    @Test
    void 중복되지_않은_3자리_리스트_반환된다() throws Exception{
        for(int i = 0;i<50;i++) {
            ComputerNumber computerNumber = new ComputerNumber();
            computerNumber.CreateDistinctComputerNum();
            assertEquals(3,computerNumber.getComputerNum().stream().distinct().count());
        }
    }
}