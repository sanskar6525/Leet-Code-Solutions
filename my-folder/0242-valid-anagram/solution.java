class Solution {
    public boolean isAnagram(String s, String t) {
        char[] temps = s.toCharArray();
        char[] tempt = t.toCharArray();
        
        Arrays.sort(temps);
        Arrays.sort(tempt);
        
        String strs = new String(temps);
        String strt = new String(tempt);
        
        return strs.equals(strt);
    }
}
