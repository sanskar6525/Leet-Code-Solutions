class Solution {
    public int findDuplicate(int[] nums) {
        Map<Integer,Integer> m=new HashMap<>();
        int res=0;
        for(int i:nums)
        {
            if(m.containsKey(i))
            {
                res=i;
                break;
            }
            m.put(i,1);
        }
        return res;
    }
}
