import java.util.Scanner;

public class CONDITIONALS {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 1. IF-ELSE STATEMENT
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("Eligible for driving.");
        } else {
            System.out.println("Not eligible for driving.");
        }

        // 2. ELSE-IF LADDER
      

        if (age >= 0 && age <= 1) {
            System.out.println("Newborn baby.");
        } else if (age > 1 && age < 18) {
            System.out.println("Child.");
        } else if (age >= 18 && age < 30) {
            System.out.println("Adult.");
        } else if (age >= 30) {
            System.out.println("Mature adult.");
        } else {
            System.out.println("Invalid age.");
        }

        // 3. TERNARY OPERATOR

        String result = (age >= 18) ? "Adult" : "Child";

        System.out.println("Ternary Result: " + result);

        // 4. SWITCH-CASE STATEMENT
       

        System.out.print("\nEnter a day number (1-7): ");
        int day = sc.nextInt();

        switch (day) {

            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;

            case 7:
                System.out.println("Sunday");
                break;

            default:
                System.out.println("Invalid day. Please enter a number between 1 and 7.");
        }

        sc.close();
    }
}