package arrays;
import java.util.Arrays;
public class Longest_Consecutive_Sequence {
	public static int longestConsecutive(int[] nums) {
        int i = 0;
        Arrays.sort(nums);//sorting the array first
        int count = 1;
        int max_count = 1;
        if(nums.length==0)//checking no element condition
        {
            return 0;
        }
        if(nums.length==1)//checking 1 element condition
        {
            return 1;
        }
        while(i<nums.length-1)//running a loop through the array
        {
            if(nums[i+1]-nums[i]==0)// if both adjacent values are similar then just continue by increasing the iterator variable
            {
                i++;
                continue;
            }
            if(nums[i+1]-nums[i]==1)// if the adjacent values having a difference of 1
            {
                count ++;
            }
            else
            {
                count = 1;  //otherwise just update the count value back to 1
            }
            if(count>max_count)//check if that count value is more than the maxcount if it is then update
            {
                max_count = count;
            }
            i++;
        }
        return max_count;
    }
	public static void main(String[] args)
	{
		int arr[] = {100, 4, 200, 1, 3, 2};
		int n = longestConsecutive(arr);
		System.out.println(n);
	}
}
