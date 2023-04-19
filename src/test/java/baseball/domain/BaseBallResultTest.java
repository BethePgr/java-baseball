package baseball.domain;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

class BaseBallResultTest {

    @Test
    void 볼_2개_스트라이크_1개() throws Exception {
        List<Integer> computerNum = new ArrayList<>(List.of(1, 2, 3));
        List<Integer> userNum = new ArrayList<>(List.of(2, 1, 3));
        BaseBallResult baseBallResult = new BaseBallResult(computerNum, userNum);
        assertEquals(2, baseBallResult.getBallCount());
        assertEquals(1, baseBallResult.getStrikeCount());
    }

    @Test
    void 볼_1개_스트라이크_1개() throws Exception {
        List<Integer> computerNum = new ArrayList<>(List.of(7, 2, 3));
        List<Integer> userNum = new ArrayList<>(List.of(2, 1, 3));
        BaseBallResult baseBallResult = new BaseBallResult(computerNum, userNum);
        assertEquals(1, baseBallResult.getBallCount());
        assertEquals(1, baseBallResult.getStrikeCount());
    }

    @Test
    void 볼_0개_스트라이크_3개() throws Exception {
        List<Integer> computerNum = new ArrayList<>(List.of(1, 2, 3));
        List<Integer> userNum = new ArrayList<>(List.of(1, 2, 3));
        BaseBallResult baseBallResult = new BaseBallResult(computerNum, userNum);
        assertEquals(0, baseBallResult.getBallCount());
        assertEquals(3, baseBallResult.getStrikeCount());
    }

    @Test
    void 볼_0개_스트라이크_0개() throws Exception {
        List<Integer> computerNum = new ArrayList<>(List.of(1, 2, 3));
        List<Integer> userNum = new ArrayList<>(List.of(7, 8, 9));
        BaseBallResult baseBallResult = new BaseBallResult(computerNum, userNum);
        assertEquals(0, baseBallResult.getBallCount());
        assertEquals(0, baseBallResult.getStrikeCount());
    }
}