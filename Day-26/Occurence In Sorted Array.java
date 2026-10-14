class Solution {
    static int getupperBound(int[] nums, int target) {
        int n = nums.length;
        int start = 0;
        int end = n - 1;
        int ans = n;
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
        int ans = n;

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
    int countFreq(int[] nums, int target) {
        // code here
        int lb = getlowerBound(nums,target);
        int ub = getupperBound(nums,target);
        int ans = ub-lb;
        return ans;
    }
}
