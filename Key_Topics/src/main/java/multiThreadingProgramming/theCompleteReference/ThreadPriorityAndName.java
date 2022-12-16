package multiThreadingProgramming;

public class ThreadPriorityAndName {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Hi " + Thread.currentThread().getPriority());
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }, "Hi Thread");

        Thread t2 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Hello " + Thread.currentThread().getPriority());
                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }, "Hello Thread");

        // t1.setName("Hi Thread");
        // t2.setName("Hello Thread");
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        System.out.println(t1.getName() + " " + t1.getPriority());
        System.out.println(t2.getName() + " " + t2.getPriority());

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
