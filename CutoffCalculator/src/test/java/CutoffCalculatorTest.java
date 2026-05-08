import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CutoffCalculatorTest {

    CutoffCalculator cc = new CutoffCalculator();

    @Test
    void testCutoff1() {

        double result = cc.calculateCutoff(200, 200, 200);

        assertEquals(200.0, result);
    }

    @Test
    void testCutoff2() {

        double result = cc.calculateCutoff(180, 170, 160);

        assertEquals(172.5, result);
    }

    @Test
    void testCutoff3() {

        double result = cc.calculateCutoff(150, 150, 150);

        assertEquals(150.0, result);
    }
}