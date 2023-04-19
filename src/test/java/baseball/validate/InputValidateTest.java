package baseball.validate;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class InputValidateTest {

    private InputValidate inputValidate;

    @BeforeEach
    void setUp(){
        inputValidate = new InputValidate();
    }

    @Test
    @DisplayName("123을 넣으면 오류는 발생하지 않는다.")
    void 오류_발생_X_123() throws Exception{
        assertDoesNotThrow(() ->inputValidate.validateInputNumber("123"));
    }

    @Test
    @DisplayName("223을 넣으면 오류가 발생한다.")
    void 오류_발생_O_223() throws Exception{
        assertThrows(IllegalArgumentException.class,() ->inputValidate.validateInputNumber("223"));
    }

    @Test
    @DisplayName("1234을 넣으면 오류가 발생한다.")
    void 오류_발생_O_1234() throws Exception{
        assertThrows(IllegalArgumentException.class,() ->inputValidate.validateInputNumber("1234"));

    }

    @Test
    @DisplayName("12을 넣으면 오류가 발생한다.")
    void 오류_발생_O_12() throws Exception{
        assertThrows(IllegalArgumentException.class,() ->inputValidate.validateInputNumber("12"));
    }

    @Test
    @DisplayName("1244을 넣으면 오류가 발생한다.")
    void 오류_발생_O_1244() throws Exception{
        assertThrows(IllegalArgumentException.class,() ->inputValidate.validateInputNumber("1244"));
    }

    @Test
    @DisplayName("1244a을 넣으면 오류가 발생한다.")
    void 오류_발생_O_1244a() throws Exception{
        assertThrows(IllegalArgumentException.class,() ->inputValidate.validateInputNumber("1244a"));
    }

}