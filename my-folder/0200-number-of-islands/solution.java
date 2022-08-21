class Solution {
    public int numIslands(char[][] grid) {
        int count = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == '1'){
                    bfs(i, j, grid); // or dfs
                    count++;
                }
            }
        }
        return count;
    }
    
    private void dfs(int i, int j, char[][] grid){
        if(i >= 0 && i < grid.length && j >= 0 && j < grid[0].length && grid[i][j] == '1'){
            grid[i][j] = '0';
            dfs(i, j - 1, grid);
            dfs(i, j + 1, grid);
            dfs(i - 1, j, grid);
            dfs(i + 1, j, grid);
        }
    }
    
    private void bfs(int i, int j, char[][] grid){
        Queue<int[]> queue = new LinkedList<>();

        queue.add(new int[]{i , j});
        grid[i][j] = '0';
        
        while(!queue.isEmpty()){
            int[] coordinate = queue.remove();
            int row = coordinate[0];
            int col = coordinate[1];
            
            if(col - 1 >= 0 && grid[row][col - 1] == '1'){
                queue.add(new int[]{row, col - 1});
                grid[row][col - 1] = '0';
            }
            
            if(col + 1 < grid[0].length && grid[row][col + 1] == '1'){   
                queue.add(new int[]{row, col + 1});
                grid[row][col + 1] = '0';
            }
            
            if(row - 1 >= 0 && grid[row - 1][col] == '1'){
                queue.add(new int[]{row - 1, col});
                grid[row - 1][col] = '0';
            }
            
            if(row + 1 < grid.length && grid[row + 1][col] == '1'){
                queue.add(new int[]{row + 1, col});
                grid[row + 1][col] = '0';
            }
        }
    }

}
