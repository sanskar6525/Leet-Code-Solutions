class Solution {
public int minCostClimbingStairs(int[] cost) {
int size = cost.length;
if(size == 2)
return Math.min(cost[0],cost[1]);
int[] dp = new int[size+1];
dp[size-1] = cost[size-1];
dp[size-2] = cost[size-2];
for(int i = size-3;i>=0;i--)
{
dp[i] = cost[i] + Math.min(dp[i+1] , dp[i+2]);
}
return Math.min(dp[0],dp[1]);
}

}
