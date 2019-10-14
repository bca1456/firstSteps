import Entity.Driver;
import Entity.Human;
import runners.*;

import java.util.Arrays;
import java.util.Date;

public class eshkere {
    public enum driverLicenseType {
        a, b, c
    }

    public static void main(String[] args){
        EntityRunner entityRunner = new EntityRunner();
        entityRunner.run();

        CollectionsRunner collectionsRunner = new CollectionsRunner();
        collectionsRunner.run();

        StreamRunner streamRunner = new StreamRunner();
        streamRunner.run();

        StringRunner stringRunner = new StringRunner();
        stringRunner.run();

        LambdaRunner lambdaRunner = new LambdaRunner();
        lambdaRunner.run();

        ThreadRunner threadRunner = new ThreadRunner();
        threadRunner.run();
    }
}
