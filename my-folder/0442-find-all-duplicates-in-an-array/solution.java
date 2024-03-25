class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Map<Integer,Integer> m=new HashMap<>();
        List<Integer> l=new ArrayList<>();

        for(int i:nums)
        {
            if(m.containsKey(i))
                l.add(i);
            m.put(i,1);
        }
        return l;
        
    }
}
