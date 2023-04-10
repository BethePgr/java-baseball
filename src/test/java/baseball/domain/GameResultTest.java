package baseball.domain;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

class GameResultTest {

    @Test
    void _3스트라이크_0볼인가() throws Exception {
        List<Integer> computerNums = new ArrayList<>();
        computerNums.add(1);
        computerNums.add(2);
        computerNums.add(3);
        List<Integer> userNums = new ArrayList<>();
        userNums.add(1);
        userNums.add(2);
        userNums.add(3);
        GameResult gameResult = new GameResult(computerNums, userNums);
        assertEquals(3,gameResult.strikeCount);
        assertEquals(0,gameResult.ballCount);
    }

    @Test
    void _2스트라이크_0볼인가() throws Exception {
        List<Integer> computerNums = new ArrayList<>();
        computerNums.add(1);
        computerNums.add(2);
        computerNums.add(3);
        List<Integer> userNums = new ArrayList<>();
        userNums.add(4);
        userNums.add(2);
        userNums.add(3);
        GameResult gameResult = new GameResult(computerNums, userNums);
        assertEquals(2,gameResult.strikeCount);
        assertEquals(0,gameResult.ballCount);
    }

    @Test
    void _1스트라이크_1볼인가() throws Exception {
        List<Integer> computerNums = new ArrayList<>();
        computerNums.add(1);
        computerNums.add(2);
        computerNums.add(3);
        List<Integer> userNums = new ArrayList<>();
        userNums.add(1);
        userNums.add(3);
        userNums.add(4);
        GameResult gameResult = new GameResult(computerNums, userNums);
        assertEquals(1,gameResult.strikeCount);
        assertEquals(1,gameResult.ballCount);
    }
    @Test
    void _0스트라이크_0볼인가() throws Exception {
        List<Integer> computerNums = new ArrayList<>();
        computerNums.add(1);
        computerNums.add(2);
        computerNums.add(3);
        List<Integer> userNums = new ArrayList<>();
        userNums.add(5);
        userNums.add(6);
        userNums.add(7);
        GameResult gameResult = new GameResult(computerNums, userNums);
        assertEquals(0,gameResult.strikeCount);
        assertEquals(0,gameResult.ballCount);
    }
}