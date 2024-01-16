class Solution {
    public static int count(String s)
    {
        int count=0;
        char[] c=s.toCharArray();
        for(char ch:c)
        {
            if(ch=='1')
                count++;
        }
        return count;
    }
    public int numberOfBeams(String[] bank) {
        int c=0;
        int start=1;
        for(int j=0;j<bank.length;j++)
        {
            String s=bank[j];
            int ones=count(s);
            if(ones==0)
                continue;
            for(int i=j+1;i<bank.length;i++)
            {
                int ones2=count(bank[i]);
                if(ones2==0)
                    continue;
                c=c+(ones*ones2);
                j=i-1;
                break;
            }
        }
           
        return c;
        
    }
}
