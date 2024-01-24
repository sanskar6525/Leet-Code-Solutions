class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        String rs="";

        String word="";
        for(int i=s.length()-1;i>=0;i--)
        {
            char c=s.charAt(i);
            if(c!=' ')
            {
                word=c+word;
            }
            else
            {
                rs=rs+word+c;
                while(c==' ')
                {
                    i--;
                    c=s.charAt(i);
                }
                i=i+1;
                word="";
            }
        }
        rs=rs+word;
        return rs;
    }
}
