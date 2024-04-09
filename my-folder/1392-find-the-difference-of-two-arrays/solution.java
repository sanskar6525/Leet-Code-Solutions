class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> res=new LinkedList<>();
        List<Integer> L1=new LinkedList<>();
        List<Integer> L2=new LinkedList<>();

        HashMap<Integer,Integer> M1=new HashMap<>();
        for(int i:nums1)
            M1.put(i, M1.getOrDefault(i,0)+1);

        HashMap<Integer,Integer> M2=new HashMap<>();
        for(int i:nums2)
            M2.put(i, M2.getOrDefault(i,0)+1);

        Set<Integer> K1=M1.keySet();
        Set<Integer> K2=M2.keySet();
        System.out.println(M1+"\n"+M2);
        for(Integer k:K1)
        {
            if(!M2.containsKey(k))
            {
                L1.add(k);
            }
           
        }

        for(Integer k:K2)
        {
            if(!M1.containsKey(k))
            {
                L2.add(k);
            }
            
        }
        res.add(L1);
        res.add(L2);
        return res;
    }
}
