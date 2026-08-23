public class ForLoops{

    public static void main(String[] args) {

        // 1. Print numbers from 1 to 10
        System.out.println("Numbers from 1 to 10:");

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }


        // 2. Print a message 10 times
        System.out.println("\nMessage 10 times:");

        for (int i = 1; i <= 10; i++) {
            System.out.println("Tushar Is The Boss");
        }


        // 3. Print odd numbers from 1 to 20
        System.out.println("\nOdd numbers from 1 to 20:");

        for (int i = 1; i <= 20; i += 2) {
            System.out.println(i);
        }


        // 4. Print even numbers from 1 to 20
        System.out.println("\nEven numbers from 1 to 20:");

        for (int i = 2; i <= 20; i += 2) {
            System.out.println(i);
        }
    }
}