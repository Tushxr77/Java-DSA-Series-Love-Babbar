public class lowerBound {
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
    public static void main(String[] args) {
        int[] arr = {1,1,2, 2, 2, 2, 2, 3, 3, 3, 6};
        int target = 5;
        int ans = getlowerBound(arr, target);
        System.out.println("ans " + ans);

    }
}
