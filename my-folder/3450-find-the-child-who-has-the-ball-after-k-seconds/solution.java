class Solution {
    public int numberOfChild(int n, int k) {
        int check=n-1;
        int res=0;
        if(k<=check)
            res=k;
        else
        {
            int full=k/check;
            int move=k%check;
            if(full%2==0)
                res=move;
            else
                res=n-1-move;
        }
        return res;
            
        
    }
}
