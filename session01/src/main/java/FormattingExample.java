
public class FormattingExample {

    public static void main(String[] args) {

        char capitalA = 'A';
        int sevens = 7777777;
        String greeting = "Hello World!";

        System.out.printf("%c \n", capitalA); // A
        System.out.printf("%5c \n", capitalA); // A right justified with 5 spaces
        System.out.printf("%s \n", greeting); // Hello World!
        System.out.printf("%15s \n", greeting);
        System.out.printf("%.5s \n", greeting);
        System.out.printf("<%15.5s>\n", greeting);
        System.out.printf("<%d>\n", sevens);// <7777777>
        System.out.printf("<%10d>\n", sevens);// < 7777777> right justified with 10 spaces
        System.out.printf("<%010d>\n", sevens);// <0007777777> right justified with 5 spaces,
        System.out.printf("<%-10d>\n", sevens);// <7777777 > left justified with 10 spaces
        System.out.println("<" + Math.PI + ">"); // <3.141592653589793>-default is Double
        System.out.printf("<%f>\n", Math.PI);// <3.141593>defaults to float output
        System.out.printf("<%e>\n", Math.PI);// <3.141593e+00> Scientific notation
        System.out.printf("<%.2f>\n", Math.PI);// <3.14> 2 decimal places
        System.out.printf("<%10.2f>\n", Math.PI); // < 3.14>2 decimal places and right

    }

}
