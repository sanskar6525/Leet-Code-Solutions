class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int i=0;
        int j=nums.length-1;
        int res=0;
        while(i<j)
        {
            int sum=nums[i]+nums[j];
            if(sum==k)
            {
                i++;
                j--;
                res++;
            }
            else if(sum>k)
                j--;
            else
                i++;
        }
        return res;
    }
}
