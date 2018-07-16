package Leetcode.array;
//No.283. Move Zeroes
public class MoveZeros {

    public static void main(String[] args){
        int[] A = {0,1,3,0,12};
        MoveZeros obj = new MoveZeros();
        int[]B = obj.moveZero(A);
        for(int i =0; i< B.length;i++){
            System.out.println(B[i]);
        }
    }

    int[] moveZero(int[] A){
        int j =0;
        for(int i = 0; i<A.length;i++){
           if(A[i] != 0){
                A[j] = A[i];
                j++;
           }
        }
        for(int k = j; k<A.length;k++)
        {
            A[k] = 0;
        }
        return A;
    }
}
