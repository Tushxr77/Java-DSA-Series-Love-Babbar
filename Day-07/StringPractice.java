import java.util.*;

public class StringPractice {
    public static void main(String[] args) {

        // Question 1
        /* String str = "Tushar";

        char[] arr = str.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            char ch = arr[i];
            System.out.println("char " + ch);
        } */


        // Counting the length of string
        /* String str1 = "My name is tushar";
        int count = 0;

        for (int i = 0; i < str1.length(); i++) {
            count += 1;
        }

        System.out.println("count " + count); */


        // Counting the vowels
        /* String str1 = "My Name Is Tushar";
        int count = 0;

        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
                    || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                count = count + 1;
            }
        }

        System.out.println(count); */


        // Reverse of a string
        /* Scanner sc = new Scanner(System.in);
        String reverse = "";

        System.out.println("Enter First string:");
        String str1 = sc.nextLine();

        int n = str1.length();

        for (int i = n - 1; i >= 0; i--) {
            char ch = str1.charAt(i);
            reverse = reverse + ch;
        }

        System.out.println("The Reverse String Is " + reverse); */


        // Check Whether the string is palindrome or not
        /* Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String:");
        String str = sc.nextLine();

        String reversed = "";
        int n = str.length();

        for (int i = n - 1; i >= 0; i--) {
            char ch = str.charAt(i);
            reversed = reversed + ch;
        }

        System.out.println("Reversed value " + reversed);

        if (str.equalsIgnoreCase(reversed)) {
            System.out.println("String is palindrome");
        } else {
            System.out.println("String is not palindrome");
        } */
    }
}
