package mylabs.mylab7;

import java.util.Random;

public class MyConcurrentPiCalculator {
    private int pointsInRadius;

    public MyConcurrentPiCalculator() {
    }

    private synchronized void synchronizedAddInRadius(int x) {
        pointsInRadius += x;
    }

    public double concurrentlyCalculatePi(int nThreads, int nIterations) throws Exception {
        int n = nIterations / nThreads;

        pointsInRadius = 0;

        Thread[] threads = new Thread[nThreads];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(() -> {
                Random localRandom = new Random();
                int localPointsInRadius = 0;
                for (int k = 0; k < n; k++) {
                    double x = localRandom.nextDouble();
                    double y = localRandom.nextDouble();
                    double dist = Math.sqrt(x * x + y * y);
                    if (dist <= 1.0) {
                        localPointsInRadius++;
                    }
                }
                synchronizedAddInRadius(localPointsInRadius);
            });
            threads[i].start();
        }

        for (Thread thread : threads) {
            thread.join();
        }

        return (double) pointsInRadius / nIterations * 4;
    }
}
