class Solution {
    public int findPermutationDifference(String s, String t) {
        int diff=0;
        int l=s.length();
        for(int i=0;i<l;i++)
        {
            char ch1=s.charAt(i);
            int d=Math.abs(i-t.indexOf(ch1));
            diff+=d;
        }
        return diff;
    }
}
