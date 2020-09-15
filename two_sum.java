package arrays;
//Given an array of integers,
//return indices of the two numbers
//such that they add up to a specific target.
//Given nums = [2, 7, 11, 15], target = 9,
//
//Because nums[0] + nums[1] = 2 + 7 = 9,
//return [0, 1].
//You may assume that each input 
//would have exactly one solution, 
//and you may not use the same element twice.
import java.util.HashMap;
import java.util.Map;
public class two_sum {
	public static void main(String[] args)
	{
		int[] nums= {2 , 11 , 7, 15};
		int target = 9;
		int[] arr = twosum(nums, target);
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	public static int [] twosum(int nums[], int target)
	{
		//this is O(n) solution
		//we are checking the if we have that value already
		//otherwise we are inserting that value in hashmap
		Map<Integer, Integer> map = new HashMap<>();
		int[] ans_arr = new int[2];
		for(int i=0; i<nums.length; i++)
		{
			int ans = target - nums[i];
			if(map.containsKey(ans)) {
				ans_arr[0]=map.get(ans );
				ans_arr[1]=i;
				return ans_arr;
			}
			map.put(nums[i],i);
		}
		throw new IllegalArgumentException("No two sum solution");
	}
}
