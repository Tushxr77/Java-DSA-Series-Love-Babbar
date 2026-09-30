public class IntersectionElement {

    static int intersection(int[] arr, int[] brr) {
        int a = arr.length;
        int b = brr.length;

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                if (arr[i] == brr[j]) {
                    return arr[i];
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {1, 5, 8, 6, 9, 3, 7};
        int[] brr = {10, 2, 5, 9, 6, 3, 8, 7, 2};

        System.out.println(intersection(arr, brr));
    }
}
