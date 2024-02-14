class Solution {
    public String reverse(String s)
    {
        String res="";
        for(int i=s.length()-1;i>=0;i--)
        {
            char c=s.charAt(i);
            res=res+c;
        }
        return res;
    }
    public String firstPalindrome(String[] words) {
        for(String g:words)
        {
            String r=reverse(g);
            if(r.equals(g))
                return r;
        }
        return "";
    }
}
