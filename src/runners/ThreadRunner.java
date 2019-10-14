package runners;

import threads.ExpThread;

public class ThreadRunner {
    public void run() {
        System.out.println("////////////////////");
        System.out.println("////ThreadRunner////");
        System.out.println("////////////////////");

        ExpThread expThread = new ExpThread();
        expThread.run();
    }
}
