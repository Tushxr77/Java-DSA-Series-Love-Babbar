package MAth;

public class MathMaxElement {

    static int max(int[] arr) {
        int max = arr[0];

        for (int i : arr) {
            max = Math.max(max, i);
        }

        return max;
    }

    public static void main(String[] args) {
        int[] arr = {7, 8, 9, 3, 5, 6, 345, 3, 8, 8, 92, 6};

        System.out.println(max(arr));
    }
}
