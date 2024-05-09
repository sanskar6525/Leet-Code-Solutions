class Solution {
    public long maximumHappinessSum(int[] happiness, int n) {
        Arrays.sort(happiness);
        int size=happiness.length;
        long res=0;
        int pos=size-1;
        int k=1;
        while(k<=n)
        {
            int ele=happiness[pos];
            ele=ele-k+1;
            //System.out.println("K= "+k+"\t"+ele);
            if(ele>0)
                res=res+ele;
            k++;
            pos--;
        }
        return res;
    }
}
