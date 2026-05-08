

public class CutoffCalculatorTest {

    CutoffCalculator cc = new CutoffCalculator();

    @Test
void testCutoff1() {

    double result = cc.calculateCutoff(200, 200, 200);

    assertEquals(200.0, result);
}
    private void assertEquals(double d, double result) {
       
        throw new UnsupportedOperationException("Unimplemented method 'assertEquals'");
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