package Entity.Programmer;

public class CppProgrammer extends Programmer {

    public CppProgrammer(){
        super();
    }

    public CppProgrammer(String name, String secondName, boolean isProgrammer){
        super(name, secondName, isProgrammer);
    }

    public void getCode(){
        System.out.println("get Cpp code");
    }
}
