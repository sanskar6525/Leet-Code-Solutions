class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k%n;
        reverse(nums, 0, n-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, n-1);
    }
    
    public void reverse(int[] nums, int st, int end) {
        for(int i=st; st<end; st++,end--) {
            int temp = nums[st];
            nums[st] = nums[end];
            nums[end] = temp;
        }
    }
}
