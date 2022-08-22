class Solution {

public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++) {
            if(map.containsKey(target-nums[i])) {
                int j = map.get(target-nums[i]);
                return new int[]{j,i};
            }
            map.put(nums[i], i);
        }
        return new int[0];
        // The above code TC and SC is:
        // TC: O(n)
        // SC: O(n)
    }
}

