package Entity.Programmer;

public class JavaProgrammer extends Programmer {

    JavaProgrammer(){
        super();
    }

    JavaProgrammer(String name, String secondName, boolean isProgrammer){
        super(name, secondName, isProgrammer);
    }

    public void getCode(){
        System.out.println("get Java code");
    }
}
