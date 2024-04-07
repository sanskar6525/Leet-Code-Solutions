class Solution {
    public String getSmallestString(String s, int k) {
        int n=s.length();
        if(k==0 || n==0)
            return s;
        
        char[] t=new char[n];
        for(int i=0;i<n;i++)
        {
            char curr=s.charAt(i);
            char best=curr;
            
            if(k!=0)
            {
                int minD=Integer.MAX_VALUE;
                
                for(char ch='a';ch<='z';ch++)
                {
                    int d=cyclicDist(curr,ch);
                    if(d<=k && (ch<best || (d<minD && ch==best)))
                    {
                        best=ch;
                        minD=d;
                    }
                }
                
                k=k-minD;
                //System.out.print(best+"\t");
                //System.out.println(minD+"\t"+k);
            }
            t[i]=best;
        }
        return new String(t);
        
    }
    
    public static int cyclicDist(char curr,char ch)
    {
        int d1=Math.abs(curr-ch);
        int d2=('z'-curr)+(ch-'a'+1);
        //System.out.println("Diff bw "+curr +" and "+ch+" ="+d1+"   "+d2);
        return Math.min(d1,d2);
      
    }
}
