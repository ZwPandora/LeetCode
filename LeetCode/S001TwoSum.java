package LeetCode;

import java.util.HashMap;

public class S001TwoSum {
    public int[] twoSum(int[] nums, int target) {
        if (nums == null || nums.length == 0) return new int[2];
        int[] ans = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                ans[0] = map.get(nums[i]);
                ans[1] = i;
                break;
            }
            map.put(target - nums[i], i);
        }
        return ans;
    }
}
