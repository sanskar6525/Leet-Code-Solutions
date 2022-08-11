class Solution {
    public int heightChecker(int[] heights) {
        int n=heights.length;
        int[]expect =heights.clone();
        Arrays.sort(expect);
        int count=0;
        for(int i=0;i<n;i++){
            if(heights[i]!=expect[i])
                count++;
        }
        return count;
    }
}
