package arrays;
/*
 * 
Given a non-empty array of digits representing a non-negative integer, increment one to the integer.

The digits are stored such that the most significant digit is at the head of the list, and each element in the array contains a single digit.

You may assume the integer does not contain any leading zero, except the number 0 itself.

Example 1:

Input: [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Example 2:

Input: [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321.
 */
public class plus_one {
	public static void main(String[] args)
	{
		int arr[] = {5,9,9,9};
		int new_arr[] = plusOne(arr);
		for(int i=0; i<new_arr.length; i++)
		{
			System.out.print(new_arr[i]);
		}
	}
	 public static int[] plusOne(int[] digits) {
	        int index = digits.length-1;
	        if(digits[index]==9 && digits[0]==9)
	        {
	            int plus[] = new int[digits.length+1];
	            for(int i=index; i>=0; i--)
	            {
	                plus[i+1]=digits[i];
	            }
	            while(digits[index]==9)
	            {
	                plus[index+1]=0;
	                index--;
	                if(index<0)
	                {
	                    break;
	                }
	            }
	            plus[index+1]=1;
	            return plus;
	        }
	        if(digits[index]==9){
	            while(digits[index]==9)
	            {
	                digits[index]=0;
	                index--;
	            }
	            digits[index]=digits[index]+1;
	            return digits;
	        }
	        int a = digits[index]+1;
	        digits[index]=a;
	        return digits;
	    }
}
