import java.util.*;

public class HighestAndLowestFreq {

    static int[] freq(int[] arr) {
        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int i : arr) {
            freq.put(i, freq.getOrDefault(i, 0) + 1);
        }

        for (int k : freq.keySet()) {
            System.out.println(k + "-->" + freq.get(k));
        }

        // For highest frequency
        int highestFreq = Integer.MIN_VALUE;
        int highestNum = -1;

        for (int k : freq.keySet()) {
            int currentKey = k;
            int currentFrequency = freq.get(k);

            if (currentFrequency > highestFreq) {
                highestFreq = currentFrequency;
                highestNum = currentKey;
            }
        }

        // For lowest frequency
        int lowestFreq = Integer.MAX_VALUE;
        int lowestNum = -1;

        for (int i : freq.keySet()) {
            int currentKey = i;
            int currentFreq = freq.get(i);

            if (currentFreq < lowestFreq) {
                lowestFreq = currentFreq;
                lowestNum = currentKey;
            }
        }

        int[] result = {highestNum, lowestNum};
        return result;
    }

    public static void main(String[] args) {

        int[] arr = {
            1, 2, 2, 3, 3, 3, 4, 4, 5, 5, 5, 5, 5,
            6, 6, 6, 66, 6, 66, 6, 6, 6, 6, 66, 6, 9
        };

        int[] ans = freq(arr);

        System.out.println("Highest freq " + ans[0]);
        System.out.println("Lowest freq " + ans[1]);
    }
}
