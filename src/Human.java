public class Human {
    private String name;
    private String secondName;

    Human(){
        this.name = "1";
        this.secondName = "11";
    }

    Human(String name, String secondName){
        this.name = name;
        this.secondName = secondName;
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName(){
        return secondName;
    }

    public void setSecondName(String secondName){
        this.secondName = secondName;
    }

    @Override
    public String toString() {
        return "Human's name:" + this.name + "  Human's secondName:" + this.secondName ;
    }
}
