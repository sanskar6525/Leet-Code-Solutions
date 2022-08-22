class Solution {
    public boolean isPowerOfFour(int n) {
        int num=n;
        boolean f=true;
        if(n==0)
        {
            f=false;
            return f;
        }
        while(num!=1)
        {
            if(num%4!=0)
            {
                f=false;
                break;
            }
            else
                num=num/4;
        }
        return f;
    }
}
