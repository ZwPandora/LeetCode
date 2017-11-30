package LeetCode;

public class S26_RemoveDuplicatesfromSortedArray {
    public int removeDuplicates(int[] nums) {
        int length=0,temp=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>temp)
            {
            	length++;            	
            	temp=nums[i];
            	nums[length-1]=nums[i];
            }
        }
        return length;
    }
}
