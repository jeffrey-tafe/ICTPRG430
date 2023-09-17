
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ScannerTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        String testString;
        int testInt;
        float testFloat;
        double testDouble;
        char testChar;

        // System.in is the input stream related to the keyboard. This is
        // already setup for yuou. Unfortunately the only read method that is
        // provided is to read one byte at a time. Reading blocks (waits)
        // until there is some input.
        System.out.println("Press any key to continue");
        System.in.read();

        // Scanner class has been provided to make it easier to read 
        // primitive types
        Scanner kbd = new Scanner(System.in);

        System.out.print("Enter a float: ");
        testFloat = kbd.nextFloat();
        System.out.println("Your float = <" + testFloat + ">");

        System.out.print("Enter an integer: ");
        testInt = kbd.nextInt();
        System.out.println("Your integer = <" + testInt + ">");

        System.out.println("Enter a double: ");
        testDouble = kbd.nextDouble();
        System.out.println("Your double = <" + testDouble + ">");

        // Characters can be read in by reading the whole line then
        // extracting the first character. By default the next method
        // reads a whole line and returns that as a String.
        System.out.print("Enter a char: ");
        testChar = kbd.next().charAt(0);
        System.out.println("Your char = <" + testChar + ">");

        // If you want to read a whole line it is easier to make a new
        // object from System.in of type BufferedRead. That class has a
        // readLine method which makes it easy
        BufferedReader myln = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a string: ");
        testString = myln.readLine();
        System.out.println("Your string = <" + testString + ">");
        
        System.out.print("Press enter to finish...");
        System.in.read();
        
    }

}
