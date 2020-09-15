package arrays;

public class buy_sell_stocks {
	 public static int maxProfit(int[] prices) {
	        int local_min = Integer.MAX_VALUE;
	        int max_profit = 0;
	        for(int i=0; i<prices.length; i++)
	        {
	            if(prices[i]<local_min)//checking if the price is less than the local minimum
	            {
	                local_min = prices[i];
	            }
	            else if(prices[i]-local_min>max_profit)//if not just subtract it with the local minimum to check
	            {
	                max_profit=prices[i]-local_min;
	            }
	        }
	        return max_profit;
	    }
	public static void main(String[] args)
	{
		int prices[] = {7,2,5,6,8,9};
		System.out.println(maxProfit(prices));
	}

}
