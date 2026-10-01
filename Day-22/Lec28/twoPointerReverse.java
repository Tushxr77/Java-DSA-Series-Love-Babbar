public class twoPointerReverse {

    static void rev(int[] arr) {
        int size = arr.length;
        int i = 0;
        int j = size - 1;

        while (i <= j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }
    }

    public static void main(String[] arsg) {

        int[] arr = {5, 6, 9, 3, 5, 8, 6, 3};

        rev(arr);

        for (int k : arr) {
            System.out.println(k);
        }
    }
}
