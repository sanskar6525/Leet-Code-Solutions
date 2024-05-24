class Solution {
    int beautifulCount = 0;
    
    public int beautifulSubsets(int[] nums, int k) {
        int n = nums.length;
        int[] bads = new int[n];
        int used = 1 << n;
        for (int i = 0; i < n; i++) {
            int badBits = 0;
            int numsI = nums[i];
            for (int j = 0; j < i; j++) {
                if (Math.abs(numsI - nums[j]) == k) {
                    badBits |= (1 << j);
                    bads[j] |= used;
                }
            }
            bads[i] = badBits;
        }
        
        int fullBeautiful = 1;
        for (int i = n - 1; i >= 0; i--)
            if (bads[i] == 0)
                fullBeautiful <<= 1;
        
        tryCombo(0, 0, bads);
        return beautifulCount * fullBeautiful - 1;  // Subtract 1 for empty set.
    }
    
    
    private void tryCombo(int idx, int bits, int[] bads) {
        while (idx < bads.length && bads[idx] == 0)  idx++;
        
        if (idx >= bads.length) {
            beautifulCount++;
            return;
        }
        
        tryCombo(idx + 1, bits, bads);
        bits |= (1 << idx);
        if ((bads[idx] & bits) == 0) 
            tryCombo(idx + 1, bits, bads);
    }
}
