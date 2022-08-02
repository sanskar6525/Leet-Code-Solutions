class Solution {
    private int findd(int[][] mat, int mid){
        int i=0,n=mat.length,j=n-1,res=0;
        while(j>=0 && i<n){
            if(mat[i][j]>mid)
                j--;
            else{
                res+=j+1;
                i++;
            }
        }
        return res;
    }
    public int kthSmallest(int[][] mat, int k) {
        int n=mat.length,l=mat[0][0],h=mat[n-1][n-1],mid,c;
        while(l<h){
            mid=(int)Math.floor((l+h)/2.0);
            c=findd(mat,mid);
            if(findd(mat,mid)<k)
                l=mid+1;
            else h=mid;
        }
        return l;
    }
}
