public class AlternateExtremElement {

    static int[] sort(int[] arr) {
        int size = arr.length;
        int i = 0;
        int k = 0;
        int j = size - 1;

        int[] ans = new int[size];

        while (i <= j) {
            ans[k] = arr[i];
            k++;
            i++;

            if (i <= j) {
                ans[k] = arr[j];
                j--;
                k++;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 6, 5, 4, 78, 89, 6, 3, 6};

        int[] result = sort(arr);

        for (int l : result) {
            System.out.print(" " + l);
        }
    }
}
