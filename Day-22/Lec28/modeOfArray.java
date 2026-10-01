import java.util.*;

public class modeOfArray {

    static int Mode(int[] arr) {
        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int k : arr) {
            freq.put(k, freq.getOrDefault(k, 0) + 1);
        }

        // Just to check or print the value
        // for (int i : freq.keySet()) {
        //     System.out.println(i + "-->" + freq.get(i));
        // }

        int maxFreq = -1;
        int maxFreqWaliKey = -1;

        for (int i : freq.keySet()) {
            int currentKey = i;
            int currentKeyFrequency = freq.get(i);

            if (currentKeyFrequency > maxFreq) {
                maxFreq = currentKeyFrequency;
                maxFreqWaliKey = currentKey;
            }
        }

        return maxFreqWaliKey;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 3, 3, 3, 4, 4, 5, 5, 5, 5, 5};

        int ans = Mode(arr);

        System.out.println(ans);
    }
}
