class Solution {
    public int maxProfit(int[] prices) {
        //int this problem we have to just check if current number
        //should be greater than its provious number
        //then we take the difference of these two and add it to the 
        //profit and returns it
        
        int profit=0;
        for(int i=1;i<prices.length;i++)
        {
            if(prices[i]>prices[i-1])
            {
              profit+=prices[i]-prices[i-1];
            }
            
        }
        return profit;

        
    }
}