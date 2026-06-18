import java.util.*;
public class TimeToBuyStock {
    public static int Stock(int[] prices){
        int buyPrice=Integer.MAX_VALUE;
        int maxProfit=0;

        for(int i=0;i<prices.length;i++){
            if(prices[i]>buyPrice){
                int profit=prices[i]-buyPrice;
                maxProfit=Math.max(profit,maxProfit);
                
            }else{
                buyPrice=prices[i];
            }
        }
        return maxProfit;

    }
    
    public static void main(String[] args) {
    int[] prices={7,1,5,3,6,4};
    System.out.println(Stock(prices));
    }
}
