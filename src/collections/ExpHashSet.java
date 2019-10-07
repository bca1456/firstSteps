package collections;

import Entity.Driver;

import java.util.HashSet;
import java.util.Iterator;

public class ExpHashSet {
    public void run(){
        Driver driver = new Driver();
        Driver driver1 = new Driver("ahmed", "nuzarbaev", "a");
        Driver driver2 = new Driver("abdul", "zanyuhov", "b");
        Driver driver3 = new Driver("ilya", "konchelovskii", "b");
        Driver driver4 = new Driver("saiid", "dadaev", "c");
        Driver driver5 = new Driver("strey", "228", "a");

        HashSet<Driver> driverHashSet = new HashSet<>();
        driverHashSet.add(driver);
        driverHashSet.add(driver1);
        driverHashSet.add(driver2);
        driverHashSet.add(driver3);
        driverHashSet.add(driver4);
        driverHashSet.add(driver5);
        System.out.println("size:" + driverHashSet.size());

        Iterator<Driver> driverIterator = driverHashSet.iterator();
        System.out.println("iterator");
        while(driverIterator.hasNext()){
            System.out.println(driverIterator.next());
        }

        System.out.println("hashset out");
        for (Driver d : driverHashSet){
            System.out.println(d);
        }
    }
}
