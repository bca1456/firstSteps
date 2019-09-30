package collections;

public class ExpIterator2 {
    public void run(){

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

    public boolean hasSofa(){
        if ()
    }
}