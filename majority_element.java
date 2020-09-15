package arrays;
import java.util.Arrays;
//Given an array of size n,
//find the majority element.
//The majority element is the
//element that appears more than ⌊ n/2 ⌋ times.
//
//You may assume that the array is
//non-empty and the majority element always exist in the array.
//
//Example 1:
//
//Input: [3,2,3]
//Output: 3
//Example 2:
//
//Input: [2,2,1,1,1,2,2]
//Output: 2
public class majority_element {
	
	public static int majorityElement(int[] nums) {
		if(nums.length==0)
            return 0;
        if(nums.length==1)
            return nums[0];
        if(nums.length>1)
        {
            Arrays.sort(nums);
        }
        return nums[nums.length/2];
    }
	
	public static void main(String[] args)
	{
		int arr[] = {2,2,1,1,1,2,2};
		int n = majorityElement(arr);
		System.out.println(n);
	}
	
}


