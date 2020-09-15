package arrays;
//Given a sorted array nums, remove the duplicates in-place such that 
//each element appear only once and return the new length.
//
//Do not allocate extra space for another array, you must
//do this by modifying the input array in-place with O(1) extra memory.
public class remove_duplicates_arr {
	public static void main(String[] args)
	{
		int nums[]= {11,11,22,22,44,44,44};
		int n = removeDuplicates(nums);
		for(int i=0; i<n; i++) {
			System.out.print(nums[i]+" ");
		}
	}
	public static int removeDuplicates(int[] nums) {
        int count = 1;
        int check = 0;
        for(int i=1; i<nums.length; i++)
        {
            if(nums[i]!=nums[i-1])
            {
                nums[count-1]=nums[i-1];
                check=0;
                count++;
            }
            else{
                check=1;
            }
            if(nums[i]!=nums[i-1] && i==nums.length-1)
            {
                nums[count-1]=nums[i];
            }
            if(i==nums.length-1 && check==1)
            {
                nums[count-1]=nums[i];
            }
        }
        return count;
    }
}
