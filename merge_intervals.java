package arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
/*
 * what is meant by this line Arrays.sort(arr, (a,b) -> a[0]-b[0])
 * 
Not sure if you are familiar with the arrow function syntax.
 Just in case, here’s a short explanation:
(a, b) => a - b is a shortcut notation for:

function (a, b){
  return a - b;
}
Function sort takes a comparison function as a parameter. 
This is what the sorting algorithm uses repeatedly to compare two elements 
in the array and decide which one goes to the left of the array and which goes to the right.

If you’re sorting numbers in ascending order, the smallest goes to the left. 
If you’re sorting in descending order, the biggest goes to the left.

The function needs to return -1 for a to be sorted to the left of b, 
1 to be sorted to the right of b and 0 to be considered equal.

In this case a - b returns

a negative number if a is smaller than b – so a will be sorted to the left of b
a positive number if a is bigger than b – so a will be sorted to the right of b
zero if they are equal – so it doesn’t matter which one comes first
If you wanted to sort in descending order, i.e. bigger numbers first, 
you’d need your function to return b - a to invert the logic.

Using a comparison function also allows you to sort your numbers in a 
completely different way to serve your purpose. You could for instance sort all 
the odd numbers first then the even numbers (the example doesn’t care about the 
internal order within odd and even numbers):

function compare(a, b){
  let mod_a = a % 2;
  let mod_b = b % 2;
  return mod_b - mod_a;
}
And of course, this is not limited to numbers. You can sort just about any 
data with your own arbitrary criteria. For instance you can sort strings based 
on their lowercase value instead of the default Unicode, or ignore ‘a’ and ‘the’ at the 
beginning. You can sort an array of objects representing your music collection by artist, 
or by album name, or by date, or all of the above.
 */
public class merge_intervals {
	
	public static int[][] merging_intervals(int arr[][])
	{
		List<int[]> res = new ArrayList<>();//making an array list to store the results
		if(arr.length==0 || arr==null)//checking array length is not null and length is equal to zero
			return res.toArray(new int[0][]);
		Arrays.sort(arr, (a,b) -> a[0]-b[0]);
		
		int start = arr[0][0];
		int end = arr[0][1];
		
		for(int[] i:arr)
		{
			if(i[0] <= end)
			{
				end = Math.max(end, i[1]);
			}
			else {
				res.add(new int[] {start,end});
				start = i[0];
				end = i[1];
			}
		}
		res.add(new int[] {start,end});
		return res.toArray(new int[0][]);
	}
	public static void main(String args[])
	{ 
		int[][] arr = {{1,3},{2,6},{8,10},{15,18}};
		int[][] res = merging_intervals(arr);
		for(int i = 0;i<res.length; i++)
		{
			for(int j=0; j<res[0].length; j++)
			{
				System.out.print(res[i][j]+" ");
			}
			System.out.println();
		}
	}
}

