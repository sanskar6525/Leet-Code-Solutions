class Solution {
    public boolean isPalindrome(int x) {
        int num=x;
        int n=0;
        while(num!=0)
        {
            int d=num%10;
            num=num/10;
            n=n*10+d;
        }
        if(Math.abs(n)==x)
            return true;
        else
            return false;
    }
}
