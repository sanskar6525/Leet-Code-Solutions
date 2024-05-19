class Solution {
    public long sumDigitDifferences(int[] nums) {
        int n = nums.length;
        if (n == 0) return 0;

        // Determine the number of digits in each number
        int numDigits = String.valueOf(nums[0]).length();
        long totalDiff = 0;

        // Process each digit position
        for (int pos = 0; pos < numDigits; pos++) {
            // Count occurrences of each digit (0-9) at this position
            int[] count = new int[10];
            for (int num : nums) {
                int digit = getDigitAtPosition(num, pos, numDigits);
                count[digit]++;
            }

            // Calculate the digit differences for this position
            for (int digit = 0; digit < 10; digit++) {
                totalDiff += count[digit] * (n - count[digit]);
            }
        }

        // Since each pair is counted twice, divide by 2
        return totalDiff / 2;
    }

    private int getDigitAtPosition(int num, int pos, int numDigits) {
        return (num / (int) Math.pow(10, numDigits - pos - 1)) % 10;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {13, 23, 12};
        System.out.println(solution.sumDigitDifferences(nums));  // Output: 4
    }
}

