package runners;

import lambdas.ExpLambda;
import lambdas.ExpLambda2;

public class LambdaRunner {
    public void run(){
        System.out.println("////////////////////");
        System.out.println("////LambdaRunner////");
        System.out.println("////////////////////");

        ExpLambda expLambda = new ExpLambda();
        expLambda.run();

        ExpLambda2 expLambda2 = new ExpLambda2();
        expLambda2.run();
    }
}
