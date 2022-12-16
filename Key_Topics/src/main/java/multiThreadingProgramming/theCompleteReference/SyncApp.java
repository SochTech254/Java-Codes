package multiThreadingProgramming;
class Printer {
    synchronized void printDocuments(int numOfCopies, String docName) {
        for (int i = 1; i <= numOfCopies; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(">> Printing " + docName + " " + i);
        }
    }
}

class MyThread extends Thread {
    Printer pRef;

    MyThread(Printer p) {
        pRef = p;
    }

    @Override
    public void run() {
        pRef.printDocuments(10, "John'sProfile.pdf");
    }
}

class YourThread extends Thread {
    Printer pRef;
    YourThread(Printer p) {
        pRef = p;
    }

    @Override
    public void run() {
        pRef.printDocuments(10, "Fiona'sProfile.pdf");
    }
}
class SyncApp {
    // main is representing main thread
    public static void main(String[] args) {
        System.out.println("==Application Started==");

        // We have only one single object of Printer
        Printer printer = new Printer();
        printer.printDocuments(10, ("Java : Complete Reference.pdf"));

        // Scenario is that we have multiple thread working on the same Printer Object
        // If multiple Threads are going to work on the same single Object we must Synchronize them
        MyThread mRef = new MyThread(printer);  // MyThread is having reference to the Printer Object
        YourThread yRef = new YourThread(printer);  // Your Thread is having reference to the Printer Object

        mRef.start();
        System.out.println("==Application Finished==");
    }
}
