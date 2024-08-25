package Week4;

public class BS_SearchSpace {
    
    static boolean check(int speed, int distance, int time){
        int dist_travelled= speed*time;
    //    if (dist_travelled>=distance) {
    //        return true;
    //    }
    //    else return false;
        return (dist_travelled>=distance);
    }
    static int reachCenter(int distance, int time){
        int lowSpeed=0;
        int highSpeed=1000;
        int optimalSpeed=0;
        while(lowSpeed<=highSpeed){
            int midSpeed= highSpeed-(highSpeed-lowSpeed)/2;
            if(check(midSpeed,distance,time)){
                optimalSpeed=midSpeed;
                highSpeed= midSpeed-1;
            }else
                lowSpeed= midSpeed+1;
        }
        return optimalSpeed;
    }
    public static void main(String[] args) {
        //Reach Pitampura
        int distance= 1000, time= 2;
        System.out.println(reachCenter(distance, time));
    }
}

//1. Aggresive Cows
//2. Painter's Patition
//3. Magnetic Balls
//4. Koko Eating Bananas
//5. Read Books//Book Allocation
// imp question do them 
// LeetCode qustions
// 2594. Minimum Time to Repair Cars
// 1552. Magnetic Force Between Two Balls
//+ assignment questoins