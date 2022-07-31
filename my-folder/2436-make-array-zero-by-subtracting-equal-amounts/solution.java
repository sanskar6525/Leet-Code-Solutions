class Solution {
    public int sum(int[] nums)
    {
        int l=nums.length;
        int sum=0;
        for(int i=0;i<l;i++)
        {
            sum=sum+nums[i];
        }
        return sum;
    }
    public int mini(int[] nums)
    {
        int l=nums.length;
        int min=454;
        for(int i=0;i<l;i++)
            {
                if(nums[i]!=0)
                    min=Math.min(min,nums[i]);
            }
        return min;
    }
    public int minimumOperations(int[] nums) {
        int counter=0;
        int l=nums.length;
        
        int s=sum(nums);
        int min=192;
        while(s!=0)
        {
            counter++;
            min=mini(nums);
            for(int i=0;i<l;i++)
            {
                if(nums[i]-min<0)
                    nums[i]=0;
                else
                    nums[i]=nums[i]-min;
            }
            s=sum(nums);
        }
        return counter;
    }
}
