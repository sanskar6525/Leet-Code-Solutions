class Solution {
    public void reverseString(char[] s) {
        int l=s.length;
        int end=l-1;
        for(int i=0;i<l/2;i++)
        {
            char c=s[i];
            s[i]=s[end];
            s[end]=c;
            end--;
        }
        
    }
}
