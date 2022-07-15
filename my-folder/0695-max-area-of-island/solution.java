
    class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int maxArea = 0;
        int rows = grid.length;
        int cols = grid[0].length;
        boolean visited[][] = new boolean[rows][cols];
            
        for(int row=0;row<rows;row++){
            for(int col=0;col<cols;col++){
                if(grid[row][col]==1&&!visited[row][col]){
                    int currArea = dfs(grid,visited,row,col,rows,cols);
                    maxArea = Math.max(maxArea,currArea);
                }
            }
        }
        
        return maxArea;
    }
    
    private int dfs(int grid[][],boolean visited[][],int row,int col,int rows,int cols){
        if(row<0||col<0||row>=rows||col>=cols||visited[row][col]||grid[row][col]==0) 
        return 0;
        
        visited[row][col] = true;
        
        int currArea = 1;
        currArea+=dfs(grid,visited,row-1,col,rows,cols);
        currArea+=dfs(grid,visited,row+1,col,rows,cols);
        currArea+=dfs(grid,visited,row,col+1,rows,cols);
        currArea+=dfs(grid,visited,row,col-1,rows,cols);
        
        return currArea;
    }
}

