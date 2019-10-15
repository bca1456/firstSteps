package runners;

import threads.ExpThread;
import threads.ExpThread2;

public class ThreadRunner {
    public void run() {
        System.out.println("////////////////////");
        System.out.println("////ThreadRunner////");
        System.out.println("////////////////////");

        ExpThread expThread = new ExpThread();
        expThread.run();

        System.out.println("////////////////////");

        ExpThread2 expThread2 = new ExpThread2();
        expThread2.run();
    }
}
