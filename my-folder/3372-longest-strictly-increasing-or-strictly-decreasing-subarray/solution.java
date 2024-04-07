class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        
        int n=nums.length;
        if(n==0)
            return 0;
        
        int[] inc=new int[n];
        int[] dec=new int[n];
        for(int i=0;i<n;i++)
        {
            inc[i]=1;
            if(i>0 && nums[i]>nums[i-1])
            {
                inc[i]=inc[i-1]+1;
            }
        }
        
        for(int i=0;i<n;i++)
        {
            dec[i]=1;
            if(i>0 && nums[i]<nums[i-1])
            {
                dec[i]=dec[i-1]+1;
            }
        }
        
        int max=0;
        for(int i=0;i<n;i++)
        {
            max=Math.max(max,(Math.max(inc[i],dec[i])));
        }
        return max;
    }
}
