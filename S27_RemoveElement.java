package LeetCode;

public class S27_RemoveElement   {
	public int removeElement(int[] nums, int val) {
		int i=0,j=0;
		for(i=0;i<nums.length;i++)
        		nums[j++]=nums[i];
        return j;
    }
}
