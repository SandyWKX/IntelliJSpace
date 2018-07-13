package Leetcode.array;
//No.561
//jdk 1.8 cannot import java.util.Array;
public class ArrayPartitionI {
	public static void main (String[] args){
		int[] nums = {1,4,3,2};
	int tmp = 0 ;
	for(int i = 0; i < nums.length; i++){
        for(int j = 0; j < nums.length - 1; j++){
            if (nums[j]> nums[j+1]){
                tmp = nums[j];
                nums[j] = nums[j+1];
                nums[j+1] = tmp;
            	}
        	}
		}
    int sum = 0;
    for (int m = 0, i = 0; i <= nums.length/2 ; i++){
        sum = sum + nums[m];
        m = m+2;
    	}
	}
}
	
	
