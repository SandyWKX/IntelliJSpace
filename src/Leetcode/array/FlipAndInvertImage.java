package Leetcode.array;
//No.832
public class FlipAndInvertImage {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] A = {{0,1,1},{1,0,0},{0,0,0}};
		int col = A.length;
		int row = A[0].length;
		int[][] flipA = new int[col][row];
		for(int i = 0; i < A.length;i++){
			for(int j = 0; j < A[i].length;j++){
				flipA[i][j] = A[i][row-j-1];
				if (flipA[i][j] == 0)
					flipA[i][j] = 1;
				else if (flipA[i][j] == 1)
					flipA[i][j] = 0;		
					}
		}
		
	
		
	}
	
	
}
