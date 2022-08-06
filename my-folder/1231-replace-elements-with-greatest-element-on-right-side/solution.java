class Solution {
    public int maxm(int[] arr,int pos,int l)
    {
        int max=0;
        for(int j=pos+1;j<l;j++)
        {
            max=Math.max(max,arr[j]);
        }
        return max;
    }
    public int[] replaceElements(int[] arr) {
        int l=arr.length;
        if(l==1)
        {
            arr[0]=-1;
            return arr;
        }
        for(int i=0;i<l;i++)
        {
            if(i==l-1)
            {
                arr[i]=-1;
            }
            else if(i==l-2)
            {
                arr[i]=arr[i+1];
            }
            else
            {
                int max=maxm(arr,i,l);
                arr[i]=max;
            }
        }
        return arr;
        
    }
}
