import java.util.Arrays;

class Solution {
    public String maximumOddBinaryNumber(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        int l=s.length();
        System.out.println(new String(chars));
        char[] res=new char[l];
        res[l-1]=chars[l-1];
        int j=l-2;
        for(int i=0;i<l-1;i++)
        {
            res[i]=chars[j--];
        }
       return new String(res);
    }
}

