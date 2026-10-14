public class UpperLowerBound {
    static int getupperBound(int[] nums, int target) {
        int n = nums.length;
        int start = 0;
        int end = n - 1;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] <= target) {
                start = mid + 1;
            } else {
                ans = mid;
                end = mid - 1;
            }
        }
        return ans;
    }
    static int getlowerBound(int[] nums, int target) {
        int n = nums.length;
        int start = 0;
        int end = n - 1;
        int ans = -1;

        while (start <= end) {
            int mid = start + (end-start ) / 2;
            if (nums[mid] >=target ) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }
}
