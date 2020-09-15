package arrays;

//if an element is zero set its entire row and column to zero
//a basic question i can ask if there is only one zero as if we are changing in the matrix itself?
public class set_matrix_to_zero {
	public static void set_matrix(int arr[][])
	{
		int row = 0;
		int column = 0;
		int flag = 0;
		for(int i=0; i<arr.length; i++)//to check if zero exists in the matrix 
		{
			for(int j=0; j<arr[0].length; j++) {
				if(arr[i][j]==0)
				{
					row = i;
					column = j;
					flag = 1;
					break;
				}
			}
		}
		if(flag==1)//confirming we got a  zero
		{
			for(int i=0; i<arr.length; i++) //changing all the rows and columns which has row or column value of zero
			{
				for(int j=0; j<arr[0].length; j++) {
					if(i==row || j==column)
					{
						arr[i][j]=0;
					}
				}
			}
		}
		
		
	}
	public static void main(String[] args)
	{
		int arr[][]= {{ 1 , 1 , 1},
					  { 1 , 0 , 1},
				      { 1 , 1 , 1}};
		set_matrix(arr);
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[0].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
