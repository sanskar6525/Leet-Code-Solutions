class Solution {
    public int[][] divideArray(int[] nums, int k) {
        int size=nums.length;
        if(size%3!=0)
            return new int[0][0];
        
        int[][] result=new int[size/3][3];
        Arrays.sort(nums);
        int pos=0;
        for(int i=0;i<size;i+=3)
        {
            if(i+2<size && nums[i+2]-nums[i]<=k)
            {
                result[pos][0]=nums[i];
                result[pos][1]=nums[i+1];
                result[pos][2]=nums[i+2];
                pos++;
            }
            else
            {
                return new int[0][0];
            }
        }
        return result;

        
    }
}
