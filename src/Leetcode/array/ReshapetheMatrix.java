package Leetcode.array;
//No.566. Reshape the Matrix
import java.util.ArrayList;
public class ReshapetheMatrix {

    public static void main(String[] args){
        int[][] A = {{1,2,3},{4,5,6}};
        ReshapetheMatrix obj = new ReshapetheMatrix();
        obj.reshape(A,3,2);
        //System.out.println(A.length+"   "+ A[0].length);
    }

    int[][] reshape(int[][] A, int r, int c){
        ArrayList myList = new ArrayList();
        //int[] mylist = new int[A.length+A[0].length];
        for(int i = 0; i < A.length; i++){
            for(int j = 0; j < A[0].length; j++){
                myList.add(A[i][j]);
            }
        }
        System.out.println(myList.size());
        if(r*c == myList.size()){
            int[][] NewA = new int[r][c];
            int listNum = 0;
            for(int i = 0; i < r; i++){
                for(int j = 0; j < c; j++){
                    NewA[i][j] = (int)myList.get(listNum);
                    //System.out.println("listNum "+myList.get(listNum)+"  "+ NewA[i][j]);
                    listNum++;
                }
            }
            return NewA;
            }
        return A;
    }
}
