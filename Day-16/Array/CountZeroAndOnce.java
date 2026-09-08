public class CountZeroAndOnce {

    static int[] count(int[] arr) {
        int size = arr.length;
        int zeroCount = 0;
        int oneCount = 0;

        for (int i = 0; i < size; i++) {
            if (arr[i] == 1) {
                oneCount++;
            } else if (arr[i] == 0) {
                zeroCount++;
            }
        }

        int[] result = {oneCount, zeroCount};
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {8, 1, 3, 1, 1, 0, 5, 1, 0};

        int[] ans = count(arr);

        System.out.println("Ones Count " + ans[0]);
        System.out.println("Zero Count " + ans[1]);
    }
}
