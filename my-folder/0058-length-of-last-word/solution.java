class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        int c=0;
        int i=s.length()-1;
        char ch=s.charAt(i);
        while(ch!=' '&& i>=0)
        {
            c++;
            i--;
            if(i>=0)
                ch=s.charAt(i);
            
        }
        return c;
    }
}
