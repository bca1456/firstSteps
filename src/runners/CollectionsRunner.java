package runners;

import collections.ExpIterator;
import collections.ExpIterator2;

public class CollectionsRunner {

    public CollectionsRunner(){

    }

    public void run(){
        System.out.println("/////////////////////////");
        System.out.println("////CollectionsRunner////");
        System.out.println("/////////////////////////");

        ExpIterator expIterator = new ExpIterator();
        expIterator.run();

        System.out.println("/////////////////////////");

        ExpIterator2 expIterator2 = new ExpIterator2();
        expIterator2.run();
    }
}
