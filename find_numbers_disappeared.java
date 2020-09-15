package arrays;
import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;
import java.util.Arrays;
//Given an array of integers where 1 ≤ a[i] ≤ n 
//(n = size of array), some elements appear twice and others appear once.
//
//Find all the elements of [1, n] inclusive 
//that do not appear in this array.
//
//Could you do it without extra space and in O(n) runtime? 
//You may assume the returned list does not count as extra space.
//
//Example:
//
//Input:
//[4,3,2,7,8,2,3,1]
//
//Output:
//[5,6]

public class find_numbers_disappeared {
	public static void main(String[] args)
	{
		int arr[] = {4,3,2,7,8,2,3,1};
		List<Integer> mainlist = new ArrayList<>();
		mainlist = findDisappearedNumbers(arr);
		for (Integer num : mainlist) {
			System.out.println(num);
		}
	}
	public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        Arrays.sort(nums);
        
        for(int i=0; i<nums.length; i++)// first inserting all the values of array into hashmap
        {
            map.put(nums[i],1);       
        }
        
        for(int i=1; i<=nums.length; i++)// now checking if the i'th value is present or not coz array contains value from 1 to arrays length
        {
            if(map.containsKey(i))
            {
                continue;
            }
            else{
                list.add(i);
            }
        }
        
        return list;
    }
}
