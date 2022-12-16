package multiThreadingProgramming;

class Callme1 {
    synchronized void call(String msg) {
        System.out.print("[" + msg);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("]");
    }
}

class Caller1 implements Runnable {
    String msg;
    final Callme1 target;
    Thread t;

    public  Caller1(Callme1 targ, String s) {
        target = targ;
        msg = s;
        t = new Thread(this);
    }

    // synchronize calls to call()
    @Override
    public void run() {
        synchronized (target)  {  // synchronized block
            target.call(msg);
        }
    }
}
class SynchronizedBlockMultiThreads {
    public static void main(String[] args) throws InterruptedException{
        Callme1 target = new Callme1();
        Caller1 ob1 = new Caller1(target, "Hello");
        Caller1 ob2 = new Caller1(target, "Synchronized");
        Caller1 ob3 = new Caller1(target, "World");

        // Start the threads.
        ob1.t.start();
        ob2.t.start();
        ob3.t.start();

        // wait for the threads to end
        ob1.t.join();
        ob2.t.join();
        ob3.t.join();
    }
}
