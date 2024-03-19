import java.util.*;
class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] fre=new int[26];
        for(char c:tasks)
            fre[c-'A']+=1;
        Arrays.sort(fre);
        System.out.println(Arrays.toString(fre));
        int max=fre[25]-1;
        int idle=max*n;
        for (int i = 24; i >= 0; i--) {
            idle -= Math.min(max, fre[i]);
        }
        return idle < 0 ? tasks.length : tasks.length + idle;
    }
}
