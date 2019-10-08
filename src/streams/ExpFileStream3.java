package streams;

import Entity.Driver;

import java.io.*;

public class ExpFileStream3 {

    public void run() {
        Driver driver = new Driver("vazgen", "da", "b");
        String driverText = driver.toString();
        try {
            FileWriter fileWriter = new FileWriter("./data2.txt", false);
            fileWriter.write(driverText);
            fileWriter.append("\n");
            fileWriter.append("chupakabra");

            fileWriter.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("written");

        try {
            FileReader fileReader = new FileReader("./data2.txt");
            int c;
            while ((c = fileReader.read()) != -1){
                System.out.print((char)c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("\nread");

//        try {
//            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("./data3.txt"));
//
//            String text;
//            while (!(text = bufferedReader.readLine()).equals("stop")){
//                bufferedWriter.write(text + "\n");
//                bufferedWriter.flush();
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }
}
