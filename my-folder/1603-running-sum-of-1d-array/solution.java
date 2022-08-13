class Solution {
    public int[] runningSum(int[] nums) {
        //int[] arr2=new int[nums.length];
        int sum1=0;
        int sum2=0;
        for(int i=0;i<nums.length;i++)
        {
            sum1=nums[i];
            sum2=sum2+sum1;
            nums[i]=sum2;
            sum1=0;
        }
        return nums;
        
    }
}
