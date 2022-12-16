package multiThreadingProgramming;

public class MultiThreading {
    public static void main(String[] args) {
        for (int i = 0; i <= 5; i++) {
            MultiThreadThing myThing = new MultiThreadThing(i);
            myThing.start();
            try {
                myThing.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
