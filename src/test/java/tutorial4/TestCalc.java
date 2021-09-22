package tutorial4;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestCalc {

    @Test
    public void TestAdd(){
        Calc calc = new Calc();
        int answer = calc.add(2,3);
        assertEquals(answer,5);
    }
}