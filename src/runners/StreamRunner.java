package runners;

import streams.ExpFileStream;
import streams.ExpFileStream2;
import streams.ExpFileStream3;

public class StreamRunner {
    public void run() {
        System.out.println("////////////////////");
        System.out.println("////StreamRunner////");
        System.out.println("////////////////////");

        ExpFileStream expFileStream = new ExpFileStream();
        expFileStream.run();

        System.out.println("////////////////////");
        ExpFileStream2 expFileStream2 = new ExpFileStream2();
        expFileStream2.run();

        System.out.println("////////////////////");
        ExpFileStream3 expFileStream3 = new ExpFileStream3();
        expFileStream3.run();
    }
}
