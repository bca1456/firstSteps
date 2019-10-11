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
    }
}

interface Operationable{
    int calculate(int x, int y);
}