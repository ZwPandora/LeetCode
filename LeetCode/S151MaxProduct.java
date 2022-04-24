package LeetCode;

public class S151MaxProduct {
    public static void main(String[] args) {
        int[] i = {1, 2, 3, 0, 4};
        System.out.println(maxProduct(i));
    }

    public static int maxProduct(int[] nums) {
        if (nums == null) {
            return 0;
        }

        int curMax = 1;
        int curMin = 1;
        int result = nums[0];

        for (int i = 0; i < nums.length; i++) {
            // stroring old max value for min calculation before it's updated
            int prevMax = curMax;
            curMax = Math.max(nums[i], Math.max(nums[i] * prevMax, nums[i] * curMin));
            curMin = Math.min(nums[i], Math.min(nums[i] * prevMax, nums[i] * curMin));
            result = Math.max(curMax, result);
        }
        return result;
    }
}
