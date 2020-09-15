package arrays;

public class sort_012 {
	public static void dutchNationalFlyAlgo(int arr[])
	{
		int low = 0;
		int mid = 0;
		int high = arr.length - 1;
		int k ;
		while(mid<=high)
		{
			switch(arr[mid]) {
				case 0:
				{
					k = arr[mid];
					arr[mid]=arr[low];
					arr[low]=k;
					low++;
					mid++;
					break;
				}
				case 1:
				{
					mid++;
					break;
				}
				case 2:
				{
					k = arr[mid];
					arr[mid]=arr[high];
					arr[high]=k;
					high--;
					break;
				}
			}
		}
	}
	public static void main(String[] args)
	{
		int arr[] = {0,1,2,1,0,1,0,1,0,2,1,0,1,2,0};
		dutchNationalFlyAlgo(arr);
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}
