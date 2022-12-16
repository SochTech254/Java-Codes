package multiThreadingProgramming;

class NewThread implements Runnable {
    Thread t;

    NewThread() {
        t = new Thread(this,"Square Thread");
        System.out.println("Square Thread " + t);
    }

    @Override
    public void run() {
        int i;
        try {
            for (i = 1; i < 10; i++) {
                System.out.println("Square thread : " + i + " => " + (Math.pow(i,2)));
                Thread.sleep(1000);
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Exiting child thread.");
    }
}
class RunnableInterfacePowerAndMainThread {
    public static void main(String[] args) throws InterruptedException {
        NewThread nt = new NewThread();
        nt.t.start();


        for (int n = 1; n < 10; n++) {
            System.out.println("Cube Thread : " + n + " => " + Math.pow(n, 3));
            Thread.sleep(1000);
        }

        System.out.println("Main thread exiting.");
    }
}
