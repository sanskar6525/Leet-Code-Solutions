class Solution {
    public static int sum(int s)
    {
        int n=s;
        int res=0;
        while(n!=0)
        {
            int d=n%10;
            res=res+(d*d);
            n=n/10;
        }
        return res;
    }
    public boolean isHappy(int n) {
        String s=Integer.toString(n);
        if(n==1)
            return true;
        
        int num1=n;
        List<Integer> L=new ArrayList<>();
        L.add(num1);

        int num2;
        do
        {
            num2=sum(num1);
            System.out.println(num2);
            if(num2==1)
                return true;
            if(L.contains(num2))
                return false;
            else
                L.add(num2);
            num1=num2;
        }while(true);
       
    }
}
