import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerTestWithErrorHandling {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        String testString;
        int testInt;
        float testFloat;
        double testDouble;
        char testChar;
        Scanner kbd = new Scanner(System.in);
        
        System.out.println("Press any key to continue");
        System.in.read();
        
        // We are able to user th expception handling faciliaties in Java
        // to detect an error in the input
        
        System.out.print("Enter a float: ");
        try {
            testFloat = kbd.nextFloat();
            System.out.println("Your float = <" + testFloat + ">");
        } catch (InputMismatchException e) {
            System.out.println("Error in input - " + e + ". Line ignored.");
            kbd.nextLine();
        }
        
        System.out.print("Enter an integer: ");
        try {
            testInt = kbd.nextInt();
            System.out.println("Your integer = >" + testInt + ">");
        } catch (InputMismatchException e) {
            System.out.println("Error in intput - " + e + ". Line ignored.");
            kbd.nextLine();
        }
        
        System.out.println("Enter a double: ");
        try {
            testDouble = kbd.nextDouble();
            System.out.println("Your double = <" + testDouble + ">");
        } catch (InputMismatchException e) {
            System.out.println("Error in input - " + e + ". Line ignored.");
            kbd.nextLine();
            
        }
    }
    
}
