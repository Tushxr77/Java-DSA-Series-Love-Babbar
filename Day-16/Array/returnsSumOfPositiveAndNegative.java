public class ReturnsSumOfPositiveAndNegative {

    static int[] sum(int[] arr) {
        int posSum = 0;
        int negSum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                posSum += arr[i];
            } else {
                negSum += arr[i];
            }
        }

        int[] result = {posSum, negSum};
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {2, -9, -8, 6, 3};

        int[] result = sum(arr);

        System.out.println("Positive Number: " + result[0]);
        System.out.println("Negative Number: " + result[1]);
    }
}
