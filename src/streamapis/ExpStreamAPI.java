package streamapis;

import Entity.Driver;
import Entity.DriverComparator;

import java.lang.reflect.Array;
import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ExpStreamAPI {
    public void run(){
        int[] intArr = {-4,2,42,234,2,562,56234,12340,-2342342,234,-4,-98,-2};
        int[] intArr2 = {-5,-4,3,2,-2,123,-5};
        double[] doubleArr = {2.9, -4, -5.6, -1, 0 , 0, -6.234};
        int count = (int) IntStream.of(-5,-4,3,2,-2,123,-5).filter(w -> w > 0).count();
        System.out.println("count: " + count);
        int max =  IntStream.of(intArr).max().orElse(0);
        System.out.println("max: " + max);
        boolean isAllMatch = IntStream.of(intArr).allMatch(q -> q%2 == 0);
        System.out.println("isAllMatch: " + isAllMatch);
        boolean isAnyMatch = DoubleStream.of(doubleArr).anyMatch(q -> q == 0);
        System.out.println("isAnyMatch: " + isAnyMatch);
        Driver driver = new Driver("zurab", "ahmet", "a");
        Driver driver2 = new Driver("zurabe", "ahmeqweet", "b");
        Driver driver3 = new Driver("ilya", "konchelovskii", "b");
        Driver driver4 = new Driver("saiid", "dadaev", "c");
        Driver driver5 = new Driver("strey", "228", "a");
        ArrayList<Driver> driverArrayList = new ArrayList<>();
        driverArrayList.add(driver);
        driverArrayList.add(driver2);
        driverArrayList.add(driver3);
        driverArrayList.add(driver4);
        driverArrayList.add(driver5);
        driverArrayList.stream() //get stream from a list
                .filter(dr -> dr.getDriverLicense().equalsIgnoreCase("b") || dr.getDriverLicense().equalsIgnoreCase("c")) //filter stream -> stay only b or c driverlicense
                .forEach(System.out::println);  // sysout filtered objects
        Stream<Driver> driverStream = Stream.of(driver, driver2, driver3, driver4, driver5);
        System.out.println("------------------");
        driverStream.filter(s -> s.getName().length() <= 5)
                .forEach(System.out::println);
        System.out.println("------------------");
        //String allDriversString = driverArrayList.stream().reduce((x, y) -> x.getDriverLicense() + " " + y.getDriverLicense());
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        Optional<Integer> min = numbers.stream().min(Integer::compare);
        System.out.println(min.orElse(666));
        System.out.println("------------------");
        Optional<Driver> minD = driverArrayList.stream().min((Comparator.comparing(Driver::getDriverLicense)));
        System.out.println(minD.orElse(new Driver("kek", "kek", "kek")));
        System.out.println("------------------");
        Stream<Driver> driverStream2 = Stream.of(driver, driver2, driver3, driver4, driver5);
        List<Driver> driverList =  driverStream2.filter(s -> s.getDriverLicense().equals("a"))
                .collect(Collectors.toList());
        for (Driver d: driverList){
            System.out.println(d);
        }
        System.out.println("------------------");
        Stream<String> wordsStream = Stream.of("мама", "мыла", "раму", "kek", "dada");
        String sentence = wordsStream.parallel().reduce("Результат:", (x,y)->x + " " + y);
        System.out.println(sentence);
        System.out.println("------------------");
        Driver[] driverArray = new Driver[]{
                driver, driver2, driver3, driver4, driver5,
                new Driver("ahmed", "da", "c")
        };
        Arrays.parallelSort(driverArray, new DriverComparator());
        for (Driver d : driverArray){
            System.out.println(d);
        }
        System.out.println("------------------");

    }
}
