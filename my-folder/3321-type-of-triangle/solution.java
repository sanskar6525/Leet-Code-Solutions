class Solution {
    public String triangleType(int[] nums) {
        int a=nums[0];
        int b=nums[1];
        int c=nums[2];
        if(a==b && b==c)
            return "equilateral";
        int ab=a+b;
        int bc=b+c;
        int ca=a+c;
        if(ab>c && bc>a && ca>b)
        {
            if(a!=b && b!=c && c!=a)
                return "scalene";
            else if(a==b && b!=c)
                return "isosceles";
            else if(a!=b && b==c)
                return "isosceles";
            else if(a==c && b!=c)
                return "isosceles";
        }
        else
            return "none";
        return ";";
    }
}
