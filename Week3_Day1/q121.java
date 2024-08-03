package Week3_Day1;

public class q121 {
   /* class Solution {
        public int maxProfit(int[] prices) {
            int maxP=0;
            int currentP=0;
            for(int i=0;i<prices.length;i++){
                for(int j=i+1;j<prices.length;j++){
                currentP=prices[j]-prices[i];
                maxP=Math.max(currentP,maxP);
                }
            }
            return maxP;
        }
    }
         */

         //most optimal method 
         class Solution {
            public int maxProfit(int[] prices) {
                int maxP=0;
                int currentP=0;
                int buyAt=prices[0];
                for(int i=0;i<prices.length;i++){
                    if(buyAt>prices[i])
                    buyAt=prices[i];
                    else{
                        currentP=prices[i]-buyAt;
                        maxP=Math.max(currentP,maxP);
                    }
                }
               return maxP;
            }
             
        }
}

//nger method solution
class Solution {
    public int maxProfit(int[] prices) {
        
        int maxElement=0;
     //   int buyAt=prices[0];
        int [] nger=new int [prices.length];
        for(int i=prices.length-1;i>=0;i--){
            nger[i]=maxElement;
           maxElement=Math.max(prices[i],maxElement);
    }
    int maxP=0;
    int currentP=0;
    for(int i=0;i<prices.length;i++){
        currentP=nger[i]-prices[i];
        maxP=Math.max(currentP,maxP);
    }
    return maxP;
     
}
}