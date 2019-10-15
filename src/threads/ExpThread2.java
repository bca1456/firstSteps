package threads;

public class ExpThread2 {
    public void run(){
        System.out.println("Main thread started...");

        Common common = new Common();

        for (int i = 0; i < 5; i++){
            JThread t = new JThread("JThread " + i, common);
            t.start();
//            try {
//                t.join();
//            } catch (InterruptedException inter){
//                System.out.println(inter);
//            }
        }
        System.out.printf("RESULT: %d \n", common.getX());
        System.out.println("Main thread finished...");
    }
}

class JThread extends Thread {
    private Common common;
    JThread(String name, Common common){
        super(name);
        this.common = common;
    }
    public void run(){
        synchronized (common) {
            System.out.printf("%s started... \n", Thread.currentThread().getName());
            //common.setX(1);
            for (int i = 0; i < 5; i++) {

                common.setX(common.getX() + 1);
                System.out.printf("%s change x to %d  \n", Thread.currentThread().getName(), common.getX());
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                }
            }
            System.out.printf("%s finished... \n", Thread.currentThread().getName());
        }
    }
}

class Common {
    private int x = 666;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}