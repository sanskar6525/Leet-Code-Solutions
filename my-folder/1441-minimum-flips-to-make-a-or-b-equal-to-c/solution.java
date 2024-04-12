public class Solution {
    public int minFlips(int a, int b, int c) {
        int cnt = 0;
        for (int i = 0; i < 32; i++) {
            if ((c & (1 << i)) != 0 && (a & (1 << i)) == 0 && (b & (1 << i)) == 0) {
                if ((a & (1 << i)) == 0)
                    a |= (1 << i);
                else
                    b |= (1 << i);
                cnt++;
            }
            if ((c & (1 << i)) == 0 && ((a & (1 << i)) != 0 || (b & (1 << i)) != 0)) {
                if ((a & (1 << i)) != 0) {
                    a &= ~(1 << i);
                    cnt++;
                }
                if ((b & (1 << i)) != 0) {
                    b &= ~(1 << i);
                    cnt++;
                }
            }
        }
        return cnt;
    }
}
