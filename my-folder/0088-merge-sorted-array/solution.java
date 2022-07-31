class Solution {
    public void shift(int arr[],int pos,int front)
    {
        for(int i=front+1;i>pos;i--)
        {
            arr[i]=arr[i-1];
        }
    }
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int front=m-1;
        int j=0;
        if((n!=0)&&(m!=0))
        {
            for(int i=0;i<nums1.length;i++)
        {
            if(nums1[i]>nums2[j])
            {
                shift(nums1,i,front);
                front++;
                nums1[i]=nums2[j];
                j++;
                if(j==n)
                    break;
                
            }
            else if(nums1[i]==nums2[j])
            {
                shift(nums1,i,front);
                front++;
                nums1[i]=nums2[j];
                j++;
                if(j==n)
                    break;
            }
        
        }
        if(j!=n){
             while(j!=n)
        {
            nums1[++front]=nums2[j++];
        }
        }
    }
        else if((m==0)&&(n!=0))
        {
            for(int i=0;i<n;i++)
            {
                nums1[i]=nums2[i];
            }
        }
}
}
