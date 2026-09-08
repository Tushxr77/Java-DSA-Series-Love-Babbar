public class MaximumNumber {

    static int max(int[] arr) {
        int size = arr.length;
        int max = arr[0];

        for (int i = 1; i < size; i++) {
            max = Math.max(max, arr[i]);
        }

        return max;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 8, 5, 6, 1, 0};
        System.out.println(max(arr));
    }
}
