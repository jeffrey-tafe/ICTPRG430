package com.mycompany.session13;

/**
 *
 * @author jeffs
 */
import java.io.*;

public class StockTest {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        File file = new File("stockFile.dat");
        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        // Create an array of Stock objects and place inside array called stocks
        Stock[] stocks = {
            new Stock(1001, "CD ROM", 100.00, 20),
            new Stock(1002, "DRAM", 75.00, 30),
            new Stock(1003, "P4 Processor", 300.00, 100),
            new Stock(1004, "Canon Jet", 80.00, 10),
            new Stock(1005, "HP Scanner", 75.00, 90)
        };

        // write array of Stock objects into the file stockFile.dat
        oos.writeObject(stocks);
        oos.close();

        // Read the Stock array from the file stockFile.dat
        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);

        // Create another array of stocks, stocks1, and read the stock objects from the file
        Stock[] stocks1 = new Stock[5];
        stocks1 = (Stock[]) ois.readObject();
        ois.close();

        // Display the Stock objeccts in the array stocks1
        System.out.println("\nSTOCK READ FROM FILE:");
        for (Stock stocks11 : stocks1) {
            System.out.println(stocks11);
        }
    }
}
