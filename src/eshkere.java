import Entity.Driver;
import Entity.Human;
import runners.CollectionsRunner;
import runners.EntityRunner;
import runners.StreamRunner;

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
    }
}
