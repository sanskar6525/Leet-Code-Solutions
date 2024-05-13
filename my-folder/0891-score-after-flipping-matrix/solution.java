class Solution {
    public void fliprow(int[][] g,int row)
    {
        for(int i=0;i<g[0].length;i++)
            g[row][i]=1-g[row][i];
    }

    public void flipcol(int[][] g,int col)
    {
        for(int i=0;i<g.length;i++)
            g[i][col]=1-g[i][col];
    }

     private int checkRow(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result = result * 2 + num;
        }
        return result;
        }

    public int matrixScore(int[][] grid) {
        int rows=grid.length;
        int cols=grid[0].length;

        for(int i=0;i<rows;i++)
        {
            if(grid[i][0]==0)
                fliprow(grid,i);
        }

        for(int j=1;j<cols;j++)
        {
            int countOnes=0;
            for(int i=0;i<rows;i++)
            {
                if(grid[i][j]==1)
                    countOnes++;
            }
            if(countOnes<rows-countOnes)
                flipcol(grid,j);
        }

        int total=0;
        for(int i=0;i<rows;i++)
        {
            int[] R=grid[i];
            
            int n=checkRow(R);
           // System.out.println(n);
            total+=n;
        }
        return total;
    }
}

