class Solution {
    public int equalPairs(int[][] grid) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for(int r=0; r<grid.length; r++) {
            int key = getRowHash(grid, r);
            map.put(key, map.getOrDefault(key, 0) + 1);
        }
        for(int c=0; c<grid.length; c++) {
            int key = getColumnHash(grid, c);
            int value = map.getOrDefault(key, -1);
            if(value != -1) {
                count += value;
            }
        }
        return count;
    }

    private int getRowHash(int[][] grid, int r) {
        int result = 0;
        for(int c=0; c<grid.length; c++) {
            result = grid[r][c] + 7* result;
        }
        return result;
    }

    private int getColumnHash(int[][] grid, int c) {
        int result = 0;
        for(int r=0; r<grid.length; r++) {
            result = grid[r][c] + 7 * result;
        }
        return result;
    }
}
