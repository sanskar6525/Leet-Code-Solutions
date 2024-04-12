class Solution {
    public int singleNumber(int[] nums) {
        return perform(0,nums);
    }
    public int perform(int i,int []a)
    {
        if(i==a.length-1)
            return a[i];
        
        return a[i] ^ perform(i+1,a);

    }
}
