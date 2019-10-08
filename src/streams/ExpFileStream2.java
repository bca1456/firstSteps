package streams;

import Entity.Driver;

import java.io.*;

public class ExpFileStream2 {

    public void run() {
        Driver driver = new Driver();
        String driverText = driver.toString();
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("./data1.txt");
            PrintStream printStream = new PrintStream(fileOutputStream);
            printStream.println(driverText);
            printStream.close();

            PrintWriter printWriter = new PrintWriter(System.out);
            printWriter.println(driverText);
            printWriter.flush();
            //printWriter.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("written");
    }
}
