package multiThreadingProgramming;

class NewThread3 extends Thread {
    String name;

    NewThread3(String threadname) {
        name = threadname;
        System.out.println("New Thread " + this);
    }

    @Override
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(name + ": " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(name + " exiting.");
    }
}
class ThreadClassMultiThread {
    public static void main(String[] args) throws InterruptedException {
        NewThread3 nt1 = new NewThread3("One");
        NewThread3 nt2 = new NewThread3("Two");
        NewThread3 nt3 = new NewThread3("Three");

        System.out.println("Thread One is alive : " + nt1.isAlive());
        System.out.println("Thread Two is alive : " + nt2.isAlive());
        System.out.println("Thread Three is alive : " + nt3.isAlive());

        System.out.println("Waiting for threads to finish.");

        nt1.start();
        nt2.start();
        nt3.start();

        Thread.sleep(1000);

        nt1.join();
        nt2.join();
        nt3.join();

        System.out.println("Thread One is alive : " + nt1.isAlive());
        System.out.println("Thread Two is alive : " + nt2.isAlive());
        System.out.println("Thread Three is alive : " + nt3.isAlive());

        System.out.println("Main Thread exiting.");

    }
}
