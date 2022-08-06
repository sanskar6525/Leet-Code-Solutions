class Solution {
    public int fre(int[] nums,int l)
    {
        int d=0;
        for(int i=0;i<l;i++)
        {
            if(nums[i]%2==0)
                d++;
        }
        return d;
    }
    public void shift(int[] nums,int l,int p,int n)
    {
        for(int i=p;i<l-1;i++)
        {
            nums[i]=nums[i+1];
        }
        nums[l-1]=n;
    }
    public int[] sortArrayByParity(int[] nums) {
        int l=nums.length;
        if((nums!=null)&&(l!=1))
        {
            int d=fre(nums,l);
            int i=0;
            for(int j=0;j<l;j++)
            {
                if(i<d)
                {
                    if(nums[j]%2==0)
                    {
                        nums[i]=nums[j];
                        i++;
                    }
                    else
                    {
                        shift(nums,l,j,nums[j]);
                        j=j-1;
                    }
                }
                else if(i+1==d)
                {
                    break;
                }
            }
        }
        return nums;
    }
}
