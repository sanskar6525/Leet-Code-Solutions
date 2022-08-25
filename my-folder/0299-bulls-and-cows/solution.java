class Solution {
    public String getHint(String secret, String guess) {
        int len = secret.length();
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        int bulls = 0;
        int cows = 0;
        for(int ind = 0; ind < len; ind++){
            int c = secret.charAt(ind)-'0';
            int s = guess.charAt(ind)-'0';
            if(c==s) bulls++;
            else map.put(c,map.getOrDefault(c,0)+1);
        }
        for(int ind = 0; ind<len ; ind++){
            int s = secret.charAt(ind)-'0';
            int c = guess.charAt(ind)-'0';
            if(s!=c && map.getOrDefault(c,0)>0){
                cows++;
                map.put(c,map.getOrDefault(c,0)-1);
            }
        }
        return bulls+"A"+cows+"B";
    }
}
