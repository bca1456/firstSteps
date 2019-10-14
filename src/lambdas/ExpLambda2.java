package lambdas;

import java.util.function.Predicate;

public class ExpLambda2 {
    public void run(){
        Predicate<Integer> isPositive = x -> x > 0;

        System.out.println("isPositive.test " + isPositive.test(5));
        System.out.println("isPositive.test " + isPositive.test(-7));
    }
}
