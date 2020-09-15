package arrays;
//Wap to tell if there is three numbers in an array when added return zero
public class two_pointers_algorithm {
	public static void main(String[] args)
	{
		int arr[]= {-4,-3,18,156,899,4534};
		if(three_sums(arr)) {
			System.out.println("Yes there is a triplet");
		}
		else {
			System.out.println("No there is no triplet");
		}
	}
	public static boolean three_sums(int arr[])
	{
		for(int i=0; i<arr.length-2; i++)
		{
			if(two_sums(arr,-arr[i],i+1)) {
				return true;
			}
		}
		return false;
	}
	public static boolean two_sums(int arr[], int target, int i)
	{
		int j = arr.length-1;
		while(i<j)
		{
			if(arr[i]+arr[j]<target)
			{
				i++;
			}
			if(arr[i]+arr[j]>target)
			{
				j--;
			}
			if(arr[i]+arr[j]==target)
			{
				return true;
			}
		}
		return false;
	}
}
