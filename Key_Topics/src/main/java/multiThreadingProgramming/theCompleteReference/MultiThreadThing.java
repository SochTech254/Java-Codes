package multiThreadingProgramming;

public class MultiThreadThing extends Thread {

    private final int threadNumber;
    public MultiThreadThing(int threadNumber) {
        this.threadNumber = threadNumber;
    }
    @Override
    public synchronized void run() {

        for (int i = 0; i <= 5; i++) {
            System.out.println(i + " from thread " + threadNumber);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }


}
