class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit=0;
        int minValue=0;
        for(int i=0;i<prices.length-1;i++){
            if(prices[i]<prices[i+1]){
                minValue=prices[i+1]-prices[i];
                maxProfit+=minValue;
            }
        }
        return maxProfit;
    }
}