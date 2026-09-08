public class MultiplyElementBy10 {

    static int[] multiplyBy10(int[] arr) {
        int size = arr.length; 
        int[] brr = new int[size]; // creating same size array

        for (int i = 0; i < size; i++) {
            int element = arr[i];
            int newElement = element * 10;
            brr[i] = newElement;
        }

        return brr;
    }

    public static void main(String[] args) {
        int[] arr = {7, 8, 9, 5};

        int[] ans = multiplyBy10(arr);

        System.out.println("Printing ans array");

        for (int i : ans) {
            System.out.print(" " + i);
        }
    }
}
