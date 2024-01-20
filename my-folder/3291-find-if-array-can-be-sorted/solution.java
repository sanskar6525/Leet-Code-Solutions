class Solution {
    public static int counts(int n)
    {
        String d=Integer.toBinaryString(n);
        int c=0;
        for(int i=0;i<d.length();i++)
        {
            if(d.charAt(i)=='1')
                c++;
        }
        return c;
    }
        
    public boolean canSortArray(int[] nums) {
        int r[]=Arrays.copyOfRange(nums,0,nums.length);
        Arrays.sort(r);
        //System.out.println(Arrays.toString(r));
        //System.out.println(Arrays.toString(nums));
        String R=Arrays.toString(r);
        
        for(int i=0;i<nums.length-1;i++)
        {
            for(int j=0;j<nums.length-i-1;j++)
            {
                if(nums[j]>nums[j+1])
                {
                    if(counts(nums[j])==counts(nums[j+1]))
                    {
                        int temp=nums[j];
                        nums[j]=nums[j+1];
                        nums[j+1]=temp;
                    }
                    else
                        return false;
                }
            }
        }
        String N=Arrays.toString(nums);
        if(N.equals(R))
            return true;
        else
            return false;
    }
}
