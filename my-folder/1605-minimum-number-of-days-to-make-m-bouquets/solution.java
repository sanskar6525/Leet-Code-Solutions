class Solution {
    public int minDays(int[] bloomDay, int m, int k) 
    {
        int n = bloomDay.length;
        if(m*k > n) return -1;

        int start = Integer.MAX_VALUE, end = 0;
        for(int data: bloomDay)
        {
            end = Math.max(end, data);
            start = Math.min(start, data);
        }


        int minDay = -1;
        while(start <= end)
        {
            int mid = start + (end - start)/2;

            if(getNumOfBouquets(bloomDay, k, mid) >= m)
            {
                minDay = mid;
                end = mid-1;
            }
            else
                start = mid+1;
        }
        return minDay;
    }

    private int getNumOfBouquets(int[] bloomDay, int k, int mid){
        
        int numOfBouquets = 0;
        int count = 0;

        for(int i=0; i<bloomDay.length; i++){
            if(bloomDay[i] <= mid){
                count++;
            }else{
                count = 0;
            }

            if(count == k){
                count = 0;
                numOfBouquets++;
            }
        }

        return numOfBouquets;
    }
}

