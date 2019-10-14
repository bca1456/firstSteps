package lambdas;


import jdk.dynalink.Operation;

public class ExpLambda {
    public void run(){
        Operationable operationable = ((x, y)-> x + y);
        Operationable operationable1 = ((x, y) -> x - y);

        int result = operationable.calculate(2,3);
        System.out.println(result);
        int result1 = operationable1.calculate(2,3);
        System.out.println(result1);

        ScumGang scumGang = (n) -> n>0;

        System.out.println("zhopa " + run2(-3, scumGang));
    }

    private String run2(int q, ScumGang func){
        if (func.gang(q)) {
            return "working";
        }
        return "not working";

    }
}

interface Operationable{
    int calculate(int x, int y);
}

interface ScumGang{
    boolean gang(int n);
}