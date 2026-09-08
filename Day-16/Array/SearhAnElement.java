public class SearchAnElement {

    static boolean search(int[] arr, int target) { 
        int size = arr.length;

        for (int i = 0; i < size; i++) {
            if (arr[i] == target) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] arr = {7, 8, 6, 9, 3};
        int n = 3;

        System.out.println(search(arr, n));
    }
}
