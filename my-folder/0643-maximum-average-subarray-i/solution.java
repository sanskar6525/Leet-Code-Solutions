class Solution {
    public double findMaxAverage(int[] nums, int k) {
        // Sum of the first 'k' elements.
        int currentSum = 0;
        for (int i = 0; i < k; ++i) {
            currentSum += nums[i];
        }
      
        // Initialize the max sum as the sum of the first 'k' elements.
        int maxSum = currentSum;
      
        // Iterate through the array starting from the k-th element.
        for (int i = k; i < nums.length; ++i) {
            // Update the current window sum by adding the new element
            // and subtracting the first element of the previous window.
            currentSum += (nums[i] - nums[i - k]);
          
            // Update the max sum if the current window sum is greater.
            maxSum = Math.max(maxSum, currentSum);
        }
      
        // Return the maximum average, which is the max sum divided by 'k',
        // converted to a double for precision.
        return maxSum * 1.0 / k;
    }
}
