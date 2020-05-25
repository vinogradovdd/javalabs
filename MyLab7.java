package mylabs.mylab7;

public class MyLab7 {
    public static void main(String[] args) throws Exception {
        int nThreads = 8;
        int nIterations = 1000000000;
        long timeStart = System.currentTimeMillis();
        MyConcurrentPiCalculator myConcurrentPiCalculator = new MyConcurrentPiCalculator();
        double calculatedPi = myConcurrentPiCalculator.concurrentlyCalculatePi(nThreads, nIterations);
        long timeElapsed = System.currentTimeMillis() - timeStart;
        System.out.println("PI is " + calculatedPi);
        System.out.println("THREADS " + nThreads);
        System.out.println("ITERATIONS " + nIterations);
        System.out.println("TIME " + timeElapsed + "ms");
    }
}
