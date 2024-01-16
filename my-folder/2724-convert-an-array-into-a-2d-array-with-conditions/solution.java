class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {

        Map<Integer,Integer> M=new HashMap<>();
        for(int i:nums)
            M.put(i,M.getOrDefault(i,0)+1);
        System.out.println(M);
        List<List<Integer>> L=new ArrayList<>();
        int max= (Collections.max(M.values()));
        for(int i=0;i<max;i++)
        {
            List<Integer> L1=new ArrayList<>();
            for (Map.Entry<Integer, Integer> entry : M.entrySet())
            {
                if(entry.getValue()>0)
                    {
                        L1.add(entry.getKey());
                        M.put(entry.getKey(),entry.getValue()-1);
                    }
            }
            L.add(L1);
        }





        return L;
        
    }
}
