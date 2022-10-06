class Solution {
   public void rotate(int[] nums, int k) {
        k%=nums.length;
        int n = nums.length-1;
        if(n==0){
            return;
        }
        // for reversig the whole array
        reverse(nums,0,n);
        // for reversing the first k elements
        reverse(nums,0,k-1);
        // for reversing the last elements
        reverse(nums,k,n);
    }
    // simple reversing code using two pointer
    public void reverse(int[] nums , int i ,int j){
        while(i<=j){
            int temp = nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
    }
}
