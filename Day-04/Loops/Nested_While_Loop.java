public class Nested_While_Loop {

    public static void main(String[] args) {

        // Outer loop → controls rows
        int i = 1; 

        while (i <= 5) {

            // Inner loop → controls columns
            int j = 1;

            while (j <= 5) {

                System.out.print("* ");
                j++;
            }

            // Move to the next line
            System.out.println();

            i++;
        }
    }
}
