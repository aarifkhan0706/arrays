package arrays;

public class palindrome_number {
	public static void main(String[] args)
	{
		System.out.println(isPalindrome(1214));
	}
	 public static boolean isPalindrome(int x) {
	        int check = 0;
	        int temp = x;
	        int rem = 0;
	        if(x<0)//eliminating negative values before hand
	        {
	            return false;
	        }
	        while(x>0)//basically reversing a number
	        {
	            rem = x%10;
	            check = check*10+rem;//making other number 
	            x=x/10;
	        }
	        if(check==temp){//checking if that number is same as passed
	            return true;
	        }
	        return false;
	    }

}
