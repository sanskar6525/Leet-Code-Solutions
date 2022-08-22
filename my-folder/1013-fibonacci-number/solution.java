class Solution {
    public int fib(int n) {
        int sum=0;
        int x1=0;
        int x2=1;
        int i=1;
        if(n==0)
            sum=0;
        else if(n==1)
            sum=1;
        else
        {
            while(i!=n)
            {
                sum=x1+x2;
                x1=x2;
                x2=sum;
                i++;
            }
        }
        return sum;
    }
}
