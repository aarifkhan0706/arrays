package arrays;
//Given an array nums, write a function to move all
//0's to the end of it while maintaining the relative
//order of the non-zero elements.
//
//Example:
//
//Input: [0,1,0,3,12]
//Output: [1,3,12,0,0]
//Note:
//
//You must do this in-place without making a copy of the array.
//Minimize the total number of operations.
public class move_zeroes {
	public static void main(String[] args)
	{	
		int arr[] = {0,1,0,3,12};
		moveZeroes(arr);
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	 public static void moveZeroes(int[] nums) {
	        int i = 0;
	        int j = 1;
	        int temp = 0;
	        if(nums.length==1)
	        {
	            
	        }
	        else{
	            while(j<nums.length||i<nums.length){
	                if(nums[i]==0){
	                    if(nums[j]==0)
	                    {
	                        j++;
	                        if(j>=nums.length)
	                        {
	                            break;
	                        }
	                    }
	                    else{
	                        //write the swap function
	                        temp = nums[j];
	                        nums[j]=nums[i];
	                        nums[i]=temp;
	                    }
	                }
	                else{
	                    i++;
	                    j=i;
	                    if(i>nums.length||j>nums.length)
	                        {
	                            break;
	                        }
	                }
	            }
	        }
	    }
}
