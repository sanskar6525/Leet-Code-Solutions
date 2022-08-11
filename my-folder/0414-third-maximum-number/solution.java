class Solution
{
public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int res = nums[n-1];
        int c = 1;
        
        for(int i=n-2; i>=0; --i){
            if(c == 3){
                break;
            }
            if(nums[i] != res){
                res = nums[i];
                ++c;
            }
        }
        if(c < 3){
            res = nums[n-1];
        }
        return res;
    }

}

