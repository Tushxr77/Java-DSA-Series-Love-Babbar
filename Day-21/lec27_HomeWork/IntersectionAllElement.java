import java.util.*;

public class IntersectionAllElement {

    static ArrayList<Integer> intersection(int[] arr, int[] brr) {
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < brr.length; j++) {
                if (arr[i] == brr[j]) {
                    result.add(arr[i]);
                    break;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 5, 8, 6, 3, 96, 89, 4, 2};
        int[] brr = {5, 86, 2, 86, 92, 3, 89, 5, 6, 6};

        ArrayList<Integer> ans = intersection(arr, brr);

        for (int i : ans) {
            System.out.print(" " + i);
        }
    }
}
