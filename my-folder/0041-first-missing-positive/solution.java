class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int res=0;
        int n=nums.length;
        int i=1;
        System.out.println(Arrays.toString(nums));
        for(int j:nums)
        {
            if(j<=0)
                continue;
            if(j<i)
                continue;
            if(j==i)
                i++;
            else
                break; 
        }
        return i;

    }
}
