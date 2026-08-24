public class Methods {

    // Method without parameters
    static void table() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(2 * i);
        }
    }

    // Method with parameters
    static void sum(int x, int y) {
        int sum = x + y;
        System.out.println(sum);
    }
    //Calling Methods
    public static void main(String[] args) {

        System.out.println("Table of 2:");
        table();

        System.out.println("Sum:");
        sum(8, 9);
    }
}
