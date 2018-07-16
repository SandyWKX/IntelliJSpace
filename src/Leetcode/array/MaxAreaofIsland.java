package Leetcode.array;
//695. Max Area of Island
public class MaxAreaofIsland {

    public static void main(String[] args){
        int[][] grid = {{0,0,1,0,0,0,0,1,0,0,0,0,0},{0,0,0,0,0,0,0,1,1,1,0,0,0},{0,1,1,0,1,0,0,0,0,0,0,0,0},{0,1,0,0,1,1,0,0,1,0,1,0,0},{0,1,0,0,1,1,0,0,1,1,1,0,0},{0,0,0,0,0,0,0,0,0,0,1,0,0},{0,0,0,0,0,0,0,1,1,1,0,0,0},{0,0,0,0,0,0,0,1,1,0,0,0,0}};
        int max;
        MaxAreaofIsland obj = new MaxAreaofIsland();
        max = obj.maxAreaOfIsland(grid);
        System.out.println(max);
    }

   int maxAreaOfIsland(int[][] grid){
        int max = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] != 0){
                    max = Math.max(max, islandArea(grid,i,j));
                }
            }
        }
        return max;
   }

   int islandArea(int[][] grid, int i, int j){
       if(i>= 0 && i< grid.length && j>= 0 && j< grid[0].length && grid[i][j] != 0) {
           grid[i][j] = 0;
           return 1 + islandArea(grid, i + 1, j) + islandArea(grid, i - 1, j) + islandArea(grid, i, j + 1) + islandArea(grid, i, j - 1);
       }
       return 0;
   }

}


