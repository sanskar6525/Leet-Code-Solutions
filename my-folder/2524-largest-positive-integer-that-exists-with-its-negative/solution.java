class Solution {
    public int findMaxK(int[] nums) {
        Arrays.sort(nums);
        boolean flag=false;
        int s=0;
        int e=nums.length-1;
        while(!flag && s!=e)
        {
            int first=-nums[s];
            int last=nums[e];
            if(first==last)
                flag=true;
            
            else if(first<last)
                e--;
            
            else if(first>last)
                s++;
        }
        if(flag==true)
            return nums[e];
        
        return -1;
    }
}
