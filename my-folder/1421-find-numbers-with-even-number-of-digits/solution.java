class Solution {
    public int digits(int n)
    {
        int m=n;
        int c=0;
        while(m!=0)
        {
            c++;
            m=m/10;
        }
        return c;
    }
    public int findNumbers(int[] nums) {
        int counter=0;
        int res;
        for(int i:nums)
        {
            res=digits(i);
            if(res%2==0)
                counter++;
        }
        return counter;

    }
}
