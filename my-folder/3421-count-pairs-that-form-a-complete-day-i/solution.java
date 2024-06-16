class Solution {
    public int countCompleteDayPairs(int[] hours) 
    {
        int count=0;
        int l=hours.length;
        for(int i=0;i<l-1;i++)
        {
            for(int j=i+1;j<l;j++)
            {
                int sum=hours[i]+hours[j];
                if(sum%24==0)
                    count++;
            }
        }
        return count;
        
    }
}
