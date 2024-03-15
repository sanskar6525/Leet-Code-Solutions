class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] pre=new int[nums.length];
        int[] suf=new int[nums.length];
        int[] res=new int[nums.length];
        Arrays.fill(pre,1);
        Arrays.fill(suf,1);
        for(int i=1;i<nums.length;i++)
        {
            pre[i]=pre[i-1]*nums[i-1];
        }
        System.out.println(Arrays.toString(pre));

        for(int i=nums.length-2;i>=0;i--)
        {
            suf[i]=suf[i+1]*nums[i+1];
            res[i]=suf[i]*pre[i];
        }
        System.out.println(Arrays.toString(suf));
        res[0]=suf[0];
        res[nums.length-1]=pre[nums.length-1];
        return res;
    }
}
