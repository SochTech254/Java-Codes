package multiThreadingProgramming;

class NewThread1 extends Thread {

    NewThread1(){
        super("Child Thread");
        System.out.println("Child Thread : " + this);
    }

    @Override
    public void run() {
        int i;
        try {
            for (i = 1; i < 10; i++) {
                System.out.println("Child Thread : " + i + " => " + Math.pow(i, 2));
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Exiting Child Thread.");
    }
}

class ThreadClassPowerAndMainThread {
    public static void main(String[] args) throws InterruptedException {
        NewThread1 nt1 = new NewThread1();

        nt1.start();

        for (int n = 1; n < 10; n++) {
            System.out.println("Main Thread : " + n + " => " + Math.pow(n, 3));
            Thread.sleep(1000);
        }

        System.out.println("Main Thread exiting.");
    }
}
