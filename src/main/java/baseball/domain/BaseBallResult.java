package baseball.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class BaseBallResult {

    private final int ballCount;
    private final int strikeCount;

    public BaseBallResult(List<Integer> computerNums, List<Integer> userNums) {
        this.ballCount = countBall(computerNums, userNums);
        this.strikeCount = countStrike(computerNums, userNums);
    }

    private int countBall(List<Integer> computerNums, List<Integer> userNums) {
        return (int) Stream.iterate(0, i -> i + 1).limit(computerNums.size()).filter(num ->
            computerNums.get(num) != userNums.get(num) && computerNums.contains(userNums.get(num))
        ).count();
    }

    private int countStrike(List<Integer> computerNums, List<Integer> userNums) {
        return (int) Stream.iterate(0, i -> i + 1).limit(computerNums.size())
            .filter(num -> computerNums.get(num) == userNums.get(num)).count();
    }

    public int getBallCount() {
        return ballCount;
    }

    public int getStrikeCount() {
        return strikeCount;
    }
}
