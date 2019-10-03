package collections;

import Entity.Driver;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.ListIterator;


public class ExpCollections {
    public ExpCollections(){

    }

    public void run(){
        Driver driver = new Driver();
        Driver driver1 = new Driver("ahmed", "nuzarbaev", "a");
        Driver driver2 = new Driver("abdul", "zanyuhov", "b");
        Driver driver3 = new Driver("ilya", "konchelovskii", "b");
        Driver driver4 = new Driver("saiid", "dadaev", "c");
        Driver driver5 = new Driver("strey", "228", "a");
        ArrayList<Driver> list = new ArrayList<>();
        list.add(driver);
        list.add(driver1);
        list.add(driver2);
        list.add(driver3);
        list.add(driver4);
        list.add(driver5);

        for (Object elem: list) {
            System.out.println(elem);
        }

        Comparator<Driver> comparator = (o1, o2) -> o1.getDriverLicense().compareTo(o2.getDriverLicense());
        list.sort(comparator);
        System.out.println("sorted");
        for (Object elem: list) {
            System.out.println(elem);
        }


    }
}