class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int l1=nums1.length;
        int l2=nums2.length;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> L=new ArrayList<>();
        for(int i=0;i<l1;i++)
        {
            int a=nums1[i];
            for(int j=0;j<l2;j++)
            {
                int b=nums2[j];
                if(a==b)
                {
                    if(!L.contains(a))
                        L.add(a);
                }
                if(b>a)
                    break;
            }
        }
        int[] res=new int[L.size()];
        for(int i=0;i<L.size();i++)
        {
            res[i]=L.get(i);
        }
        
        return res;
    }
}
