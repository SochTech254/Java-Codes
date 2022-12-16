package multiThreadingProgramming;

class NewThread2 implements Runnable {
    Thread t;
    String name;

    NewThread2(String threadname) {
        name = threadname;
        t = new Thread(this, name);
        System.out.println("New Thread : " + t);
    }

    @Override
    public synchronized void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(name + ": " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(name + " Exiting");
    }
}
class RunnableInterfaceMultiThread {
    public static void main(String[] args) throws InterruptedException {
        NewThread2 nt1 = new NewThread2("One");
        NewThread2 nt2 = new NewThread2("Two");
        NewThread2 nt3 = new NewThread2("Three");

        nt1.t.start();
        nt2.t.start();
        nt3.t.start();

        System.out.println("Thread One is alive : " + nt1.t.isAlive());
        System.out.println("Thread Two is alive : " + nt2.t.isAlive());
        System.out.println("Thread Three is alive : " + nt3.t.isAlive());

        System.out.println("Waiting for threads to finish.");

        Thread.sleep(1000);

        nt1.t.join();
        nt2.t.join();
        nt3.t.join();

        System.out.println("Thread One is alive : " + nt1.t.isAlive());
        System.out.println("Thread Two is alive : " + nt2.t.isAlive());
        System.out.println("Thread Three is alive : " + nt3.t.isAlive());

        System.out.println("Main thread exiting.");

    }
}
