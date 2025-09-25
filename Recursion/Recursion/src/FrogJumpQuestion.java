//There are N stones numbered as 0,1,2...n-1.
// A frog travels from one end to another.
// Each stone has height.
// Cost to jump from one stone to another is absolute value of difference fo height of the two stone.
//A frog can jump either one stone or two stones.
//Find minimum cost to traverse the path.

import java.util.*;
class FrogJumpQuestion{
    static int Travel(int h[],int n,int idx){
        if(idx==n-1)        //Base Cases
            return 0;

        int cost1=Travel(h,n,idx+1) + Math.abs(h[idx]-h[idx+1]);     //Recursive Cases
        if(idx==n-2)
            return cost1;

        int cost2=Travel(h,n,idx+2) + Math.abs(h[idx]-h[idx+2]);
        return Math.min(cost1,cost2);   //Self Work
    }
    public static void main(String[] args) {
        int h[]={10,30,40,20};
        int idx=0;
        System.out.println("The Minimum Cost of travelling is: "+Travel(h,h.length,idx));
    }
}