class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        //Finding out the maximum difficulty task
        int maxDiff=0;
        for(int i:difficulty)
            maxDiff=Math.max(i,maxDiff);
        
        //Linking the profit related to the given difficulty
        int[] maxProfit=new int[maxDiff+1];
        for(int i=0;i<difficulty.length;i++)
        {
            maxProfit[difficulty[i]]=Math.max(maxProfit[difficulty[i]],profit[i]);
        }
        
        //Calculating cumulative profit
        for(int i=1;i<=maxDiff;i++)
        {
            maxProfit[i]=Math.max(maxProfit[i],maxProfit[i-1]);
        }

        int total=0;
        for(int a:worker)
        {
            if(a>maxDiff)
                total+=maxProfit[maxDiff];

            else
                total+=maxProfit[a];
           
        }
        return total;
    }
}
