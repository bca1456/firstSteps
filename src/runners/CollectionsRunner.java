package runners;

import collections.*;

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

        System.out.println("/////////////////////////");
        ExpCollections expCollections = new ExpCollections();
        expCollections.run();

        System.out.println("/////////////////////////");
        ExpDeqQueue expDeqQueue = new ExpDeqQueue();
        expDeqQueue.run();

        System.out.println("/////////////////////////");
        ExpHashSet expHashSet = new ExpHashSet();
        expHashSet.run();
    }
}
