package Entity;

import java.util.Comparator;

public class DriverComparator implements Comparator<Driver> {
    @Override
    public int compare(Driver o1, Driver o2) {
        return o1.getName().toUpperCase().compareTo(o2.getName().toUpperCase());
    }
}