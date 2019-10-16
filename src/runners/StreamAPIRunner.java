package runners;


import streamapis.ExpStreamAPI;

public class StreamAPIRunner {
    public void run() {
        System.out.println("///////////////////////");
        System.out.println("////StreamAPIRunner////");
        System.out.println("///////////////////////");

        ExpStreamAPI expStreamAPI = new ExpStreamAPI();
        expStreamAPI.run();
    }
}
