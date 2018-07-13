package Leetcode.array;
//No.867
public class TransposeMatrix {
    public static void main(String[] args){
    int[][] A = {{1,2,3},{4,5,6}};
    TransposeMatrix matrix = new TransposeMatrix();
    int[][] B = matrix.transpose(A);
  /*for (int i =0; i<B.length;i++){
        for (int j = 0; j<B[i].length;j++){
            System.out.println(B[i][j]);
            //System.out.println(B.length);
            //System.out.println("A: "+A[i][j]);
            }
        }*/
    }
    int[][] transpose(int[][] A){
        int row = A.length;
        int col = A[0].length;

        int[][] NewA = new int[col][row];

        int temp=0;
        for(int i = 0; i < A.length; i++){
            for(int j =0; j < A[i].length; j++){
                NewA[j][i] = A[i][j];
            }
        }
        return NewA;
    }
}
