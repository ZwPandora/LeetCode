package LeetCode;

public class S035SearchInsertPosition {
	public int searchInsert(int[] nums, int target) {
		if(nums.length==0||nums[0]>target)
			return 0;
        if(target>nums[nums.length-1])
        	return nums.length;
        int i=0,j=nums.length-1,mid=0;
        while(j-i>1) {
        	mid=(i+j)/2;
        	if(nums[mid]<=target)i=mid;
        	else j=mid;
        }
        return nums[i]==target?i:j;
    }
}
