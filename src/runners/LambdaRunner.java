package runners;

import lambdas.ExpLambda;

public class LambdaRunner {
    public void run(){
        System.out.println("////////////////////");
        System.out.println("////LambdaRunner////");
        System.out.println("////////////////////");

        ExpLambda expLambda = new ExpLambda();
        expLambda.run();
    }
}
