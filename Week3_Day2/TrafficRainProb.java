package Week3_Day2;
//leet code ques 42
public class TrafficRainProb {
    //method 1 
    class Solution {
        public int trap(int[] height) {
            int totalWater=0;
           // int 
            for(int i=0;i<height.length;i++){
               int currentLevel=0;
                int currentWater=0;
                int leftGreatest=0;
                int rightGreatest=0;
                for(int j=i-1;j>=0;j--)
                leftGreatest=Math.max(leftGreatest,height[j]);
                 for(int j=i+1;j<height.length;j++)
                rightGreatest=Math.max(rightGreatest,height[j]);
                currentLevel=Math.min(leftGreatest,rightGreatest);
                currentWater=currentLevel-height[i];
                if(currentWater>0)
                totalWater+=currentWater;
            }
            return totalWater;
        }
    }
    //most optimal solution 
  /*   class Solution {
        public int trap(int[] height) {
            int totalWater=0;
           int [] nger=NGER(height);
           int [] ngel=NGEL(height);
            for(int i=0;i<height.length;i++){
               int currentLevel=0;
                int currentWater=0;
         
                currentLevel=Math.min(nger[i],ngel[i]);
                currentWater=currentLevel-height[i];
                if(currentWater>0)
                totalWater+=currentWater;
            }
            return totalWater;
        }
    
        static  int[] NGEL(int[] arr){
            int maxElement=0;
            int[] ngel=new int[arr.length];
            for (int i = 0; i <arr.length; i++) {
                ngel[i]=maxElement;
                maxElement=Math.max(maxElement, arr[i]);
            }
                return ngel;
        }
         static  int[] NGER(int[] arr){
                int maxElement=0;
                int[] nger=new int[arr.length];
                for (int i = arr.length-1; i >=0; i--) {
                    nger[i]=maxElement;
                    maxElement=Math.max(maxElement, arr[i]);
                }
                    return nger;
            }
        
    }
            */
}
