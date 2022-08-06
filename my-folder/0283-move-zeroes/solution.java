class Solution {
    public void add(int[] nums,int i,int l)
    {
        for(int j=i;j<l;j++)
        {
            nums[j]=0;
        }
    }
    public void moveZeroes(int[] nums) {
        int l=nums.length;
        if((nums!=null)||(l!=1))
        {
            int i=0;
            for(int j=0;j<l;j++)
            {
                if(nums[j]!=0)
                {
                    nums[i]=nums[j];
                    i++;
                }
            }
            
            if(i-1<l-1)
            {
                add(nums,i,l);
            }
        }
        
    }
}
