public class reverseArray {

    static void rev(int[] arr) {
        int size = arr.length;

        for (int i = size - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {

        int[] arr = {7, 5, 8, 3, 6, 9};

        rev(arr);
    }
}
