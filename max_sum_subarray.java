package arrays;
//Given an integer array nums,
//find the contiguous subarray
//(containing at least one number)
//which has the largest sum and return its sum.
public class max_sum_subarray {
	public static void main(String[] args)
	{
		int arr[]= {-2,1,-3,4,-1,2,1,-5,4};
		int max = max_sum_subarr(arr);
		System.out.println(max);
	}
	public static int max_sum_subarr(int arr[])
	{
		//this approach is called kadane's algorithm
		int curr_sum = 0;
		int max_sum = Integer.MIN_VALUE;
		for(int i=0; i<arr.length; i++)
		{
			curr_sum += arr[i];
			if(curr_sum>max_sum)//checking if the current sum is greater
			{
				max_sum = curr_sum;
			}
			if(curr_sum<0)//if the curr_sum is getting less than zero update the curr sum to zero
			{
				curr_sum=0;
			}
		}
		return max_sum;
	}
}
