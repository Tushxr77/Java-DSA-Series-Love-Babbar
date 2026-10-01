public class ShiftElementBy1 {

    static void shift(int[] arr) {
        int size = arr.length;

        // Temp store last value
        int temp = arr[size - 1];

        // Shift by one
        for (int i = size - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }

        arr[0] = temp;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 9, 8, 7};

        shift(arr);

        for (int k : arr) {
            System.out.println(k);
        }
    }
}
