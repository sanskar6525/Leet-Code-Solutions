class Solution {
    public boolean isSubsequence(String s, String t) {
        char sh[]=s.toCharArray();
        char th[]=t.toCharArray();
        int i=0;
        int j=0;
        while(i<sh.length && j<th.length){
            if(sh[i]==th[j]){
                i++;
                j++;
            }else{
                j++;
            }
            
        }
        if(i==sh.length){
            return true;
        }
        return false;
    }
}
