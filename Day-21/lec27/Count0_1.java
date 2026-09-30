public class Count0_1 {

    static int[] count(int[] arr) {
        int zeroCount = 0;
        int oneCount = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                zeroCount++;
            } else if (arr[i] == 1) {
                oneCount++;
            }
        }

        int[] result = {zeroCount, oneCount};
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 8, 0, 6, 9, 1, 6, 0, 2, 1, 5, 8, 0, 1, 2, 0, 1};

        int[] ans = count(arr);

        System.out.println("One Count " + ans[1]);
        System.out.println("Zero Count " + ans[0]);
    }
}
