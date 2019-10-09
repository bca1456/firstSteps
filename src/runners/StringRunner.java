package runners;

public class StringRunner {
    public void run() {
        System.out.println("////////////////////");
        System.out.println("////StringRunner////");
        System.out.println("////////////////////");

        String str = "vitalya-gay";
        StringBuilder stringBuilder = new StringBuilder(str);

        System.out.printf("Capacity: %s", stringBuilder.capacity());
        System.out.printf("\nLength: %s", stringBuilder.length());
        stringBuilder.append("!!!");
        System.out.printf("\n%s", stringBuilder);
        stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        System.out.printf("\n%s", stringBuilder);
        System.out.printf("\nReverse: %s", stringBuilder.reverse());
    }
}
