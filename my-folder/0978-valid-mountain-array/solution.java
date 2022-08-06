class Solution {
    public boolean validMountainArray(int[] arr) {
        boolean f=false;
        int l=arr.length;
        if(l<3)
            return f;
        else
        {
            int pos=0;
            for(int i=0;i<l-1;i++)
            {
                if((i==0)&&((arr[i]>arr[i+1])||(arr[i]==arr[i+1])))
                {
                    return f;
                }
                if(arr[i]==arr[i+1])
                {
                    return f;
                }
                if(arr[i]>arr[i+1])
                {
                    pos=i;
                    break;
                }     
            }
            for(int i=pos;i<l;i++)
            {
                f=true;
                if((i!=l-1)&&((arr[i]<arr[i+1])||(arr[i]==arr[i+1])))
                {
                    f=false;
                    break;
                }
            }
            return f;
        }
    }
}
