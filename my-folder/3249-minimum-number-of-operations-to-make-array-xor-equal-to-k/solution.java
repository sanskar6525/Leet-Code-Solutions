class Solution {
    public int minOperations(int[] nums, int k) {
        int fxor=0;
        int count=0;
        for(int i:nums)
            fxor=fxor^i;
        
        while(k>0 || fxor>0)
        {
            if((k%2)!=(fxor%2))
                count++;
            
            k/=2;
            fxor/=2;
        }

        return count;
    }
}
