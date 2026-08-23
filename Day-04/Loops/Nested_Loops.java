public class Nested_Loops { 

    public static void main(String[] args) {

      
        // 1. NESTED FOR LOOP - PATTERN PRINTING
     

        for (int i = 1; i <= 3; i++) {

            for (int j = 1; j <= 3; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }


        // 2. UNDERSTANDING INNER AND OUTER LOOP
       

        for (int i = 1; i <= 3; i++) {

            for (int j = 1; j <= 3; j++) {
                System.out.println("i = " + i + " j = " + j);
            }
        }


        
        // 3. BREAK KEYWORD
        

        for (int i = 1; i <= 10; i++) {

            if (i == 5) {
                break;
            }

            System.out.println(i);
        }


     
        // 4. CONTINUE KEYWORD
        
        for (int i = 1; i <= 10; i++) {

            if (i == 5) {
                continue;
            }

            System.out.println(i);
        }
    }
}
