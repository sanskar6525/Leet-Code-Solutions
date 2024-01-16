class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int c=0;
        int start=0;
        for(int i:g)
        {
            for(int j=start;j<s.length;j++)
            {
                if(i<=s[j])
                    {
                        start=j+1;
                        c++;
                        break;
                    }
            }
        }
        return c;
    }
}
