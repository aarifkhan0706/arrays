/*
 * Condition is Time Complexity less than O(n^2) and Space Complexity O(1) constant space
 * There are three ways to solve this question:
 * 1. Sorting the array and comparing each element by i and i+1 way T.C: O(nlogn), S.C: O(1)
 * 2. Hashing Technique making a frequency table T.C: O(n) , S.C: O(n)
 * 3. Linked List Cycle Method or Tortoise Method T.C: O(n) , S.C: O(1)
 */
package arrays;

public class duplicate_number {
	public static int findDuplicate(int[] nums) {
		int slow = nums[0];
		int fast = nums[0];
		do {
			slow = nums[slow];
			fast = nums[nums[fast]];
		}
		while(slow!=fast);
		
		fast = nums[0];
		
		while(slow!=fast){
			slow = nums[slow];
			fast = nums[fast];
		}
		return slow;
	}
	public static void main(String[] args)
	{
		int[] arr = {2,5,9,6,9,3,8,9,7,1};
		System.out.print(findDuplicate(arr));
	}
}
