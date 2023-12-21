import java.util.*;
class Solution {
    public static double myPow(double x, int n) {
        if(n<0)
        {
            n=-n;
            x=1/x;
        }
        double pow=1;
        while(n!=0)
        {
            if((n&1)!=0){
                pow=pow*x;
            }
            x=x*x;
            n>>>=1;
        }
        return pow;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        double num=sc.nextDouble();
        int n=sc.nextInt();
        System.out.println(myPow(num,n));
    }
}
