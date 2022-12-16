package multiThreadingProgramming;

public class MultiThreadDemo {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Hi");
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Hello");
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });


        t1.start();
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        t2.start();

        try {
             t1.join();
             t2.join();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(t1.isAlive());
        System.out.println("Bye");
    }
}
