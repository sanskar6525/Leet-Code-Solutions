class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        //int min=Math.min(l1,l2);
        int res=-1;
        int start=0;
        for(int i=0;i<nums1.length;i++)
        {
            int a=nums1[i];
            for(int j=start;j<nums2.length;j++)
            {
                int b=nums2[j];
                if(a==b)
                {
                    res=a;
                    break;
                }
                else if(b>a)
                    break;
            }
            if(res!=-1)
                break;
        }
        return res;
    }
}

