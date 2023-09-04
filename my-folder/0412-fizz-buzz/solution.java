class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> L=new ArrayList<String>(n);

        for(int i=0;i<n;i++)
        {
            int r=i+1;
            int r3=r%3;
            int r5=r%5;
            if(r3!=0 && r5!=0)
            {
                String s=Integer.toString(r);
                L.add(s);
            }
            else if(r3==0 && r5==0)
                L.add("FizzBuzz");
            else if(r3!=0 && r5==0)
                 L.add("Buzz");
            else
                 L.add("Fizz");

        }
        return L;
        
    }
}
