package baseball.domain;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class UserNumberTest {

    @Test
    void 사용자가_입력한_숫자가_오류가_작동하나1() throws Exception{
        assertThrows(IllegalArgumentException.class,()->{
            new UserNumber("1234");
        });
    }

    @Test
    void 사용자가_입력한_숫자가_오류가_작동하나2() throws Exception{
        assertThrows(IllegalArgumentException.class,()->{
            new UserNumber("12");
        });
    }

    @Test
    void 사용자가_입력한_숫자가_오류가_작동하나3() throws Exception{
        assertThrows(IllegalArgumentException.class,()->{
            new UserNumber("122");
        });
    }

    @Test
    void 사용자가_입력한_숫자가_오류가_작동하나4() throws Exception{
        assertThrows(IllegalArgumentException.class,()->{
            new UserNumber("ㄹ32");
        });
    }

    @Test
    void 사용자가_입력한_숫자가_오류가_작동하나5() throws Exception{
        assertThrows(IllegalArgumentException.class,()->{
            new UserNumber("ㄹ3");
        });
    }

    @Test
    void 사용자가_입력한_숫자가_오류가_작동하나6() throws Exception{
        assertThrows(IllegalArgumentException.class,()->{
            new UserNumber("가나2");
        });
    }

    @Test
    void 사용자가_입력한_숫자가_오류가_없나1() throws Exception{
        assertDoesNotThrow(()->{
            new UserNumber("123");
        });
    }

    @Test
    void 사용자가_입력한_숫자가_오류가_없나2() throws Exception{
        assertDoesNotThrow(()->{
            new UserNumber("423");
        });
    }

    @Test
    void 사용자가_입력한_숫자가_오류가_없나3() throws Exception{
        assertDoesNotThrow(()->{
            new UserNumber("678");
        });
    }

    @Test
    void 사용자가_입력한_숫자가_오류가_없나4() throws Exception{
        assertDoesNotThrow(()->{
            new UserNumber("892");
        });
    }
}