package collections;

import java.text.MessageFormat;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class ExpIterator2 {
    public void run(){
        Item sofa = new Item("sofa", 5);
        Item chair = new Item("chair", 3);
        Item table = new Item("table", 1);

        Room room = new Room();
        room.setSofa(sofa);
        room.setChair(chair);
        room.setTable(table);

        RoomIterator roomIterator = new RoomIterator(room);

        System.out.println(roomIterator.hasNext());
        System.out.println(roomIterator.next());
        roomIterator.remove();
        System.out.println(roomIterator.hasNext());
        System.out.println(roomIterator.next());
        roomIterator.remove();System.out.println(roomIterator.hasNext());
        System.out.println(roomIterator.next());
        roomIterator.remove();
    }
}

class Item {
    private String name;
    private Integer quantity;


    public Item(){
        this.name = "qwe";
        this.quantity = 1;
    }

    Item(String name, Integer quantity){
        this.name = name;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return String.format("itemName: %s, itemQuantity: %o", this.name, this.quantity);
    }
}

class Room {
    private Item sofa = new Item("sofa", 2);
    private Item chair = new Item("chair", 5);
    private Item table = new Item("table", 1);

    public Item getSofa() {
        return sofa;
    }
    public void setSofa(Item sofa) {
        this.sofa = sofa;
    }
    public boolean hasSofa(){ return sofa != null; }

    public Item getChair() {return chair; }
    public void setChair(Item chair) { this.chair = chair; }
    public boolean hasChair(){ return chair != null; }

    public Item getTable() { return table; }
    public void setTable(Item table) { this.table = table; }
    public boolean hasTable(){ return table != null; }
}

class RoomIterator implements Iterator<Item>{
    private int index = -1;  //0 - sofa , 1 - chair, 2 - table
    private Room room;

    RoomIterator(Room room) {
        this.room = room;
    }

    @Override
    public Item next() {
        switch (this.index) {
            case -1:
                if (room.hasSofa()){
                    this.index = 0;
                    return room.getSofa();
                } else if (room.hasChair()){
                    this.index = 1;
                    return room.getChair();
                } else if (room.hasTable()){
                    this.index = 2;
                    return room.getTable();
                }
                break;
            case 0:
                if (room.hasChair()){
                    this.index = 1;
                    return room.getChair();
                } else if (room.hasTable()){
                    this.index = 2;
                    return room.getTable();
                }
                break;
            case 1:
                if (room.hasTable()){
                    this.index = 2;
                    return room.getTable();
                }
                break;
        }
        return null;
    }

    @Override
    public boolean hasNext() {
        switch (this.index){
            case -1:
                return room.hasSofa() || room.hasChair() ||  room.hasTable();
            case 0:
                return  room.hasChair() || room.hasTable();
            case 1:
                return room.hasTable();
        }
        return false;
    }

    @Override
    public void remove() {
        switch (this.index){
            case -1:
                throw new NoSuchElementException();
            case 0:
                if (room.hasSofa()) {
                    room.setSofa(null);
                } else {
                    throw new NoSuchElementException();
                }
                break;
            case 1:
                if (room.hasChair()) {
                    room.setChair(null);
                } else {
                    throw new NoSuchElementException();
                }
                break;
            case 2:
                if (room.hasTable()) {
                    room.setTable(null);
                } else {
                    throw new NoSuchElementException();
                }
                break;
        }
    }
}