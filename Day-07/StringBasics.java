import java.util.Scanner;

public class StringBasics {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Declaration type 1
        /* String First_name = "Tushar";
        String Last_name = "Sharma"; */

        // System.out.println(First_name + " " + Last_name);

        // Declaration type 2
        // String Str = new String("tushar");
        // System.out.println(Str);

        // Methods
        /* System.out.println(First_name.length());
        System.out.println(Last_name.charAt(2));

        System.out.println(Str.length()); */

        // Comparing
        /* if (First_name.equals(Str)) {
            System.out.println("both are equal");
        } else {
            System.out.println("both are not equal");
        } */

        /* if (First_name.equalsIgnoreCase(Str)) {
            System.out.println("both are equal");
        } else {
            System.out.println("both are not equal");
        } */

        // Take input from user
        System.out.println("Enter a string:");
        String str = sc.nextLine();
        System.out.println("Value: " + str);

        // Second way
        System.out.println("Enter second string:");
        String str1 = sc.next();
        System.out.println("String value for second: " + str1);

        sc.close();
    }
}
