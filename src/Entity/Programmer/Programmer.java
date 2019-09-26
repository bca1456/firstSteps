package Entity.Programmer;


import Entity.Human;

public abstract class Programmer extends Human {
    private boolean isProgrammer;

    Programmer(){
        super();
        this.isProgrammer = true;
    }

    Programmer(String name, String secondName, boolean isProgrammer){
        super(name, secondName);
        this.isProgrammer = isProgrammer;
    }

    public boolean getIsProgrammer(){
        return isProgrammer;
    }

    public void setIsProgrammer(boolean isProgrammer){
        this.isProgrammer = isProgrammer;
    }

    public abstract void getCode();

    @Override
    public String toString() {
        return "Programmers name:" + this.getName() +
                " Programmers second name:" + this.getSecondName() +
                " Is programmer:" + this.isProgrammer;
    }
}
