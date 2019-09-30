package collections;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ExpIterator {
    public void run() {
        // создадим монстра
        Monster monster = new Monster();
        // отрубим ему голову
        monster.setHead(null);
        // создадим итератор
        Iterator iterator = new MonsterIterator(monster);
        // есть ли у него еще части?
        System.out.println(iterator.hasNext()); // true
        // какая следующая часть
        System.out.println(iterator.next()); // Hand
        // а еще есть?
        System.out.println(iterator.hasNext()); // true
        // какая следующая часть
        System.out.println(iterator.next()); // Leg
        // а если отрубить
        iterator.remove();
        // а еще есть?
        System.out.println(iterator.hasNext()); // false
        // а что с ногой-то?
        System.out.println(monster.getTheOnlyLeg()); // null
    }

}

class MonsterIterator implements Iterator<Monster.Part> {
    private int index = -1;
    private Monster m;

    MonsterIterator(Monster m) {
        this.m = m;
    }

    public boolean hasNext() {
        if (index == -1) return m.hasHead() || m.hasHand() || m.hasLeg();
        if (index == 0) return m.hasHand() || m.hasLeg();
        if (index == 1) return m.hasLeg();
        return false;
    }

    public Monster.Part next() {
        if (index == -1) {
            if (m.hasHead()) { index = 0; return m.getHead(); }
            if (m.hasHand()) { index = 1; return m.getTheOnlyHand(); }
            if (m.hasLeg()) { index = 2; return m.getTheOnlyLeg(); }
        }
        if (index == 0) {
            if (m.hasHand()) { index = 1; return m.getTheOnlyHand(); }
            if (m.hasLeg()) { index = 2; return m.getTheOnlyLeg(); }
        }
        if (index == 1) {
            if (m.hasLeg()) { index = 2; return m.getTheOnlyLeg(); }
        }
        throw new NoSuchElementException();
    }

    public void remove() {
        if (index == -1) throw new IllegalStateException();
        if (index == 0)
            if (m.hasHead()) m.setHead(null);
            else throw new IllegalStateException();
        if (index == 1)
            if (m.hasHand()) m.setTheOnlyHand(null);
            else throw new IllegalStateException();
        if (index == 2)
            if (m.hasLeg()) m.setTheOnlyLeg(null);
            else throw new IllegalStateException();
    }
}

class Monster {
    private Head head = new Head();
    private Hand theOnlyHand = new Hand();
    private Leg theOnlyLeg = new Leg();

    public Head getHead() { return head; }
    public void setHead(Head rightHead) { this.head = rightHead; }
    public boolean hasHead() { return head != null; }

    public Hand getTheOnlyHand() { return theOnlyHand; }
    public void setTheOnlyHand(Hand theOnlyHand) { this.theOnlyHand = theOnlyHand; }
    public boolean hasHand() { return theOnlyHand != null; }

    public Leg getTheOnlyLeg() { return theOnlyLeg; }
    public void setTheOnlyLeg(Leg theOnlyLeg) { this.theOnlyLeg = theOnlyLeg; }
    public boolean hasLeg() { return theOnlyLeg != null; }

    public interface Part { }
    public static class Head implements Part { }
    public static class Hand implements Part { }
    public static class Leg implements Part { }
}