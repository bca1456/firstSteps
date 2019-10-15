package threads;

public class ExpThread {
    public void run() {
        System.out.println("Main thread started...");

            for (int i = 0; i < 5; i++) {
                QThread qThread = new QThread("qThread " + i);
                qThread.start();
                try {
                    qThread.join();
                } catch (InterruptedException exc) {
                    System.out.printf("%s throw was interrupted", qThread.getName());
                }
            }

        System.out.println("Main thread finished...");
    }
}

class QThread extends Thread {
    QThread(String name){
        super(name);
    }

    @Override
    public void run(){

        System.out.printf("%s started... \n", Thread.currentThread().getName());
        try{
            Thread.sleep(500);
        }
        catch(InterruptedException e){
            System.out.println("Thread has been interrupted");
        }
        System.out.printf("%s finished... \n", Thread.currentThread().getName());
    }
}