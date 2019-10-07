package collections;

import Entity.Human;

import java.util.ArrayDeque;
import java.util.Queue;

public class ExpDeqQueue {
    public void run(){
        Human human = new Human("ivan","pavlov");
        Human human1 = new Human("serg","mikhitaryan");
        Human human2 = new Human("davlet", "mamedov");
        Human human3 = new Human("zhopa", "volosataya");
        Human human4 = new Human("doska", "derevyannaya");

        ArrayDeque<Human> humanQueue = new ArrayDeque<>();
        humanQueue.add(human);
        humanQueue.addFirst(human1);
        humanQueue.addLast(human2);
        humanQueue.add(human3);
        humanQueue.add(human4);

        System.out.println("first " + humanQueue.getFirst());
        System.out.println("last " + humanQueue.getLast());
        humanQueue.offerFirst(human3);
        System.out.println("first " + humanQueue.getFirst());
    }
}
