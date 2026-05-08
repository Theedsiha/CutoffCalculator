public class CutoffCalculator {

    public double calculateCutoff(int maths, int physics, int chemistry) {

        double cutoff = (maths / 2.0) +
                        (physics / 4.0) +
                        (chemistry / 4.0);

        return cutoff;
    }
    public static void main(String[] args) {

        CutoffCalculator cc = new CutoffCalculator();

        double result = cc.calculateCutoff(180, 170, 160);

        System.out.println("Engineering Cutoff = " + result);
    }
}
