class Solution {
    public int minimumChairs(String s) {
        int l=s.length();
        int currChairs=0;
        int inside=0;
        
        for(int i=0;i<l;i++)
        {
            char ch=s.charAt(i);
            if(ch=='E')
            {
                if(inside<currChairs) //If there is already an empty seat available
                    inside++;
                else                  //If there is no empty seat available
                {
                    currChairs++;
                    inside++;
                }
            }
            else
            {
                inside--;
            }
            //System.out.println("Inside ="+inside+" and chairs ="+currChairs);
        }
        return currChairs;
    }
}
