import java.util.*;

public class Array {

    public static void main(String[] args) {

        int[] arr = new int[5];

        Scanner sc = new Scanner(System.in);

        int n = arr.length;

        // Input
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the element:");
            arr[i] = sc.nextInt();
        }

        // Print
        for (int val : arr) {
            System.out.println(val);
        }

        sc.close();
    }
}