class Solution {
    public boolean[] isArraySpecial(int[] nums, int[][] queries) {
        int n = nums.length;
        int q = queries.length;
        
       
        int[] prefixSum = new int[n];
        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1];
            if ((nums[i - 1] % 2) != (nums[i] % 2)) {
                prefixSum[i]++;
            }
        }
        

        boolean[] res = new boolean[q];
        
       
        for (int i = 0; i < q; i++) {
            int start = queries[i][0];
            int end = queries[i][1];
            int count = prefixSum[end] - prefixSum[start];
            if (count == (end - start)) {
                res[i] = true;
            } else {
                res[i] = false;
            }
        }
        
        return res;
    }
}

