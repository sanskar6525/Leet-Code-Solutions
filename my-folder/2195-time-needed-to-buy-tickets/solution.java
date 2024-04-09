class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
       
        int time=0;
        int t=tickets[k];

        while(t!=0)
        {
            for(int i=0;i<tickets.length;i++)
            {
                if(tickets[i]!=0)
                {
                    tickets[i]=tickets[i]-1;
                    time++;
                }
                else
                    continue;
                
                if(k==i)
                    t--;

                if(t==0)
                    break;
            }

        }
        return time;

        
    }
}
