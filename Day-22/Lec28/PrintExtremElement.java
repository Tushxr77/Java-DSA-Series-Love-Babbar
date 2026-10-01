public class PrintExtremElement {

    static int[] Sorted(int[] arr) {
        int n = arr.length;
        int i = 0;
        int j = n - 1;
        int k = 0;

        int[] ans = new int[n];

        while (i <= j) {
            ans[k] = arr[i];
            i++;
            k++;

            if (i <= j) {
                ans[k] = arr[j];
                j--;
                k++;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 6, 5, 47, 89, 5};

        int[] result = Sorted(arr);

        for (int k : result) {
            System.out.print(" " + k);
        }
    }
}
