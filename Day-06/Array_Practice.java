import java.util.Scanner;

public class Array_Practice {
    public static void main(String[] args) {

        /* int arr[] = {12, 14, 1245, -5, 9, 8};
        int n = arr.length; */

        // Sum of the elements in array
        /* int sum = 0;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int value = arr[i];
            sum = sum + value;
        }
        System.out.println(sum); */

        // Multiplication of elements in array
        /* int mul = 1;

        for (int i = 0; i < n; i++) {
            int value = arr[i];
            mul = mul * value;
        }
        System.out.println(mul); */

        // Find the max in array
        /* int max = arr[0];

        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("The max element is " + max); */

        // Find the min value
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[9];

        for (int i = 0; i < 9; i++) {
            System.out.println("Enter the element:");
            arr[i] = sc.nextInt();
        }

        // Print array
        for (int val : arr) {
            System.out.println(val);
        }

        int min = arr[0];

        for (int i = 0; i < 9; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Minimum number is " + min);

        sc.close();
    }
}