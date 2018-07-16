package Leetcode.array;
import java.util.*;
import java.util.Collection;
import java.util.List;

//No.485 Given a binary array, find the maximum number of consecutive 1s in this array.
public class MaxConsecutiveOne {

    public static void main(String[] args){
        int[] A = {1,0,1,1,1,0,1};
        MaxConsecutiveOne obj = new MaxConsecutiveOne();
        int Max = obj.maxConsecutiveOne(A);
        System.out.println(Max);
    }

/*    public int maxConsecutiveOne(int[] A){
        int ones = 1;
        List<Integer> largeOne = new ArrayList();
        if (A.length > 1 ){
            for (int i = 0; i < A.length-1;i++){
             if(A[i] == A[i+1]){
                ones++;
                largeOne.add(ones);
                continue;
             }else{
                ones = 1;
                largeOne.add(ones);
             }
            }
            System.out.println("largeOne: "+largeOne);
            int Max = Collections.max(largeOne);
            return Max ;
        }else if (A[0] == 0)
                return 0;
        return 1 ;
    }*/

    public int maxConsecutiveOne(int[] A){
        int max = 0;
        int now = 0;
        for(int num:A){
            if (num==1) now++;
            else now = 0;
            max= Math.max(now,max);
        }
        return max;
    }
}
