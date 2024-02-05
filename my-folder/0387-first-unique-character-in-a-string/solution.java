class Solution {
    public static Map<Integer,Integer> count(String s)
    {
        Map<Integer,Integer> M=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            int c=s.charAt(i);
            M.put(c,M.getOrDefault(c,0)+1);
        }
        return M;
    }
    public int firstUniqChar(String s) {
        Map<Integer,Integer> M=count(s);
        for(int i=0;i<s.length();i++)
        {
            int c=s.charAt(i);
            if(M.get(c)==1)
                return i;
        }

        return -1;

        
    }
}
