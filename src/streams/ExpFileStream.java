package streams;

import Entity.Driver;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExpFileStream {

    public void run() {
        Driver driver = new Driver();
        String driverText = driver.toString();
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("./data.txt");
            byte[] buffer = driverText.getBytes();
            fileOutputStream.write(buffer, 0 , buffer.length);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("written");
    }
}
