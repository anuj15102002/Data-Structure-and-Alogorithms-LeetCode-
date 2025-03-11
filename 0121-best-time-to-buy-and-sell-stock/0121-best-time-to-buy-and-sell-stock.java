class Solution {
    public int maxProfit(int[] prices) {
        int buy=prices[0]; //first element we set as to buy
        int profit=0;

        for(int n:prices)
        {
            //first check if the buy value is less than the current
            //value or not ,if not then we change it to the current 
            //value
            if(n<buy)
            {   
                buy=n;
            }
            else if(n-buy>profit) //we check the maximum profit
            {
                profit=n-buy;
            }                      //by finding the difference between
                                    //current prices and prvious buy price
        }
        return profit;
    }
}