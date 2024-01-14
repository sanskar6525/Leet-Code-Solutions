class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[] n=nums;
        Arrays.sort(n);
        Map<Integer,Integer> M=new HashMap<>();
        int max=1;
        for(int i=0;i<nums.length;i++)
        {
            int d=nums[i];
            if(!M.containsKey(d))
                M.put(d,1);
            else
            {
                M.put(d,M.get(d)+1);
                max=Math.max(max,M.get(d));
            }
        }
        Set<Integer> S=M.keySet(); 
        int c=0;
        for(int i:S)
        {
            if(M.get(i)==max)
                c=c+M.get(i);
        }
        return c;
        
    }
}
