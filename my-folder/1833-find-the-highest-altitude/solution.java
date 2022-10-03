class Solution {
    public int largestAltitude(int[] gain) {
        int l=gain.length;
        int max=0;
        int alt=0;
        for(int i=0;i<l;i++)
        {
            alt=alt+gain[i];
            max=Math.max(max,alt);
        }
        return max;
    }
}
