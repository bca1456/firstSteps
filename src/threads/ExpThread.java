package threads;

public class ExpThread {
    public void run(){
        System.out.println("Main thread started...");
        new qThread("JThread").start();
        System.out.println("Main thread finished...");
    }
}

class qThread extends Thread {
    qThread(String name){
        super(name);
    }

    public void run(){

        System.out.printf("%s started... \n", Thread.currentThread().getName());
        try{
            Thread.sleep(500);
        }
        catch(InterruptedException e){
            System.out.println("Thread has been interrupted");
        }
        System.out.printf("%s fiished... \n", Thread.currentThread().getName());
    }
}