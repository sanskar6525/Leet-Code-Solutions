class Solution {
    public int singleNonDuplicate(int[] nums) {
        int l=nums.length;
        int res;
        if(l<2)
        {
            return nums[0];
        }
        for(int i=0;i<l;i++)
        {
            if(i==l-1)
            {
                return nums[i];
            }
            if(nums[i]==nums[i+1])
            {
                i=i+1;
            }
            else
            {
                res=nums[i];
                return res;
            }
        }
        return 0;
    }
}
