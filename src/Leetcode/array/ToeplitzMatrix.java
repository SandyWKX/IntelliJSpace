package Leetcode.array;
//No.766
//A matrix is Toeplitz if every diagonal from top-left to bottom-right has the same element.
//Now given an M x N matrix, return True if and only if the matrix is Toeplitz.

public class ToeplitzMatrix {

    public static void main(String[] args){
        int[][] A = {{1,2,3,4},{5,2,2,3},{9,5,1,2}};
        ToeplitzMatrix obj = new ToeplitzMatrix();
        obj.Toeplitz(A);
    }

    boolean Toeplitz(int[][] A){
        for (int i = 0; i < A.length-1; i++){
            for (int j = 0; j < A[0].length-1;j++){
                if (A[i][j] == A[i+1][j+1]){
                    continue;
                }
                else{
                    System.out.println("not!");
                    return false;
                }
            }
        }
        return  true;
    }
}
