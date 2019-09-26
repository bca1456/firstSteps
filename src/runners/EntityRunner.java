package runners;

import Entity.Driver;
import Entity.Human;
import Entity.Programmer.CppProgrammer;

import java.util.Arrays;
import java.util.Date;

public class EntityRunner {
    public EntityRunner(){

    }

    public void run(){
        System.out.println("цуйцу");
        Human human1 = new Human();
        //System.out.println(human1);

        Human human2 = new Human("Vasya", "Petrov");
        //System.out.println(human2);

        Human human3 = new Human("Vasya", "Petrov");
        //System.out.println(human3);
        Human[] humans = {human1, human2, human3};

        for(Human elem : humans){
            System.out.println(elem + " ");
        }
//        if (human2 == human3){
//            System.out.println("dermo");
//        } else {
//            System.out.println("zhopa");
//        }
        System.out.println("drivers");

        Driver driver1 = new Driver();
        //System.out.println(driver1);

        Driver driver2 = new Driver("a");
        //System.out.println(driver2);

        Driver driver3 = new Driver("Dima", "Kozlov", "b");
        //System.out.println(driver3);

        Driver[] drivers = {driver1,driver2,driver3};

        for(Driver elem : drivers){
            System.out.println(elem + " ");
        }

        System.out.println("////////////////////");

        Double num = 2.0;
        num += 4;
        System.out.println(num);

        System.out.println("////////////////////");

        String str1 = "string";
        char[] charArray = {'a', 'b', 'c'};
        String str2 = new String(charArray);

        System.out.println("String: " + str1 + ", length: " + str1.length());
        System.out.println("Char arr: " + str2 + ", length: " + str2.length());
        System.out.println("Char arr to upper: " + str2.toUpperCase() + ", length: " + str2.length());

        System.out.println("/////////////////////");

        int[] nonSortedArray = {-4543,4,69,2345,27,74,564252,423,747,365,465,748};
        System.out.println("nonSortedArray: " );
        for (int elem: nonSortedArray){
            System.out.print(elem + " ");
        }
        System.out.println();
        Arrays.sort(nonSortedArray);
        int[] sortedArray = nonSortedArray;
        System.out.println("sortedArray: ");
        for (int elem: sortedArray){
            System.out.print(elem + " ");
        }

        System.out.println("/////////////////////");

        Date dateNow = new Date();
        System.out.println("dateNow: " + dateNow);
        System.out.println("milisecNow: " + dateNow.getTime());

        System.out.println("/////////////////////");

        CppProgrammer cppProgrammer = new CppProgrammer();
        System.out.println(cppProgrammer);
        cppProgrammer.getCode();
        CppProgrammer cppProgrammer1 = new CppProgrammer("Vanya","Zalupkin", true);
        System.out.println(cppProgrammer1);

    }
}
