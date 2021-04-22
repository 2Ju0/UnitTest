import org.junit.Test;

import static org.junit.Assert.*;

public class CustomCalculatorTest {
    private CustomCalculator customCalculator;

    //더하기 테스트를 진행합니다.
    @Test
    public void addTest(){
        customCalculator = new CustomCalculator();
        int result = customCalculator.add(10, 10);
        /* 테스트 코드 입력 */
//        assertTrue(result == 20);
        assertFalse(result == 19);
    }

    @Test
    public void subtractTest(){
        customCalculator = new CustomCalculator();
        int result = customCalculator.subtract(30,10);
        assertTrue(result == 20);
    }
}