class Solution {
    public int wiggleMaxLength(int[] nums) {
        int n = nums.length;
        int inc = 1;
        int dec = 1;
        for(int i = 1; i < n; i++){
            if(nums[i] > nums[i - 1]){
                inc = dec + 1;
            }
            else if(nums[i] < nums[i - 1]){
                dec = inc + 1;
            }
        }
        return Math.max(inc , dec);
    }
}
