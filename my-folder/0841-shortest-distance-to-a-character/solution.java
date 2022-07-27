class Solution {
    public int[] shortestToChar(String s, char c) {
        int l=s.length();
        int arr[]=new int[l];
        for(int i=0;i<l;i++)
        {
            int r=0;
            int min=0;
            char ch=s.charAt(i);
            if(ch!=c)
            {
                for(int j=0;j<l;j++)
                {
                    ch=s.charAt(j);
                    if((ch==c)&&(r==0))
                    {
                        r=Math.abs((i-j));
                        min=r;
                    }
                    else if(((ch==c)&&(r!=0)))
                    {
                        r=Math.abs((i-j));
                        min=Math.min(r,min);
                    }
                }
                 arr[i]=min;
            }
            else
                arr[i]=0;
        }
        return arr;
        }
    }

