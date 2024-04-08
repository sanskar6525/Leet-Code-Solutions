class Solution {
    public int maxArea(int[] height) {
        int right=height.length-1;
        int left=0;

        int max=0;
        
        while(left<right)
        {
           
            int minH=Math.min(height[left],height[right]);
            
            max=max>minH*(right-left) ?max:minH*(right-left);
            //System.out.println(height[left]+"\t"+height[right]+"\t"+max);
            while(left<right && height[left]<=minH)
                left++;

            while(left<right && height[right]<=minH)
                right--;
           
        }
        return max;
    }
}
