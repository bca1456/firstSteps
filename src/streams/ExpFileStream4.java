package streams;

import Entity.Driver;

import java.io.*;
import java.util.ArrayList;

public class ExpFileStream4 {
    public void run(){
        Driver driver = new Driver();
        Driver driver1 = new Driver("ahmed", "nuzarbaev", "a");
        Driver driver2 = new Driver("abdul", "zanyuhov", "b");
        Driver driver3 = new Driver("ilya", "konchelovskii", "b");
        Driver driver4 = new Driver("saiid", "dadaev", "c");
        ArrayList<Driver> driverArrayList = new ArrayList<>();
        driverArrayList.add(driver);
        driverArrayList.add(driver1);
        driverArrayList.add(driver2);
        driverArrayList.add(driver3);
        driverArrayList.add(driver4);

        try {
            //System.out.printf("before: \n %s \n %s \n %s \n %s \n %s", driver.toString(), driver1.toString(), driver2.toString(), driver3.toString(), driver4.toString());
            System.out.println("before: ");
            for(Driver d : driverArrayList){
                System.out.println(d.toString());
            }
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("./data4.dat"));
            objectOutputStream.writeObject(driverArrayList);
            objectOutputStream.close();

            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("./data4.dat"));
            ArrayList<Driver> newDriverArrayList = (ArrayList<Driver>) objectInputStream.readObject();
            System.out.println("after: ");
            for(Driver d : newDriverArrayList){
                System.out.println(d.toString());
            }
            objectInputStream.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
