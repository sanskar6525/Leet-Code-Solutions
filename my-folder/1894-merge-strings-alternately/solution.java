class Solution {
    public String mergeAlternately(String word1, String word2) {
        String res="";
        int l1=word1.length();
        int l2=word2.length();
        int l=Math.min(l1,l2);
        for(int i=0;i<l;i++)
            {
                res=res+word1.charAt(i)+word2.charAt(i);
            }
        if(l1==l2)
            return res;
        else if(l1>l2)
            return res+word1.substring(l,l1);
        else 
            return res+word2.substring(l,l2);
    }
}
