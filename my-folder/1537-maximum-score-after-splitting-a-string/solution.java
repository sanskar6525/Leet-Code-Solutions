import java .util.*;
class Solution {
    public static int zero(String s)
    {
        int c=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='0')
                c++;
        }
        return c;
    }
    public static int one(String s)
    {
        int c=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='1')
                c++;
        }
        return c;
    }
    public int maxScore(String s) {
        int score=0;
        int res=0;
        for(int i=0;i<s.length()-1;i++)
        {
            int zero=zero(s.substring(0,i+1));
            int one=one(s.substring(i+1,s.length()));   
            score=zero+one;
            res=Math.max(res,score);
        }
        return res;
    }
}
