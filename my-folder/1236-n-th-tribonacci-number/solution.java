class Solution {
    public int tribonacci(int n) {
        int[] a={0,1,1};
        int count=2;
        if(n<=2)
            return a[n];
        while(count<n)
        {
            int d=a[0]+a[1]+a[2];
            a[0]=a[1];
            a[1]=a[2];
            a[2]=d;
            count++;
        }
        return a[2];
        
    }
}
