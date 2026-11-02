class Solution {
    public int rob(int[] nums) {
    //    int n=nums.length;
    //    int[] dp=new int[n+1];
    //    Arrays.fill(dp,-1);
    //    return f(n-1,dp,nums);
    // }
    // public int f(int idx,int[]dp,int[]nums){
    //     if(idx==0) return nums[idx];
    //     if(idx<0) return 0;
    //     if(dp[idx] != -1) return dp[idx];
    //     int take=nums[idx]+f(idx-2,dp,nums);
    //     int not_take=0+f(idx-1,dp,nums);
    //     dp[idx]=Math.max(take,not_take);
    //     return dp[idx];

    int n=nums.length;
    if(n==1) return nums[0];
    int[]dp=new int[n];
    dp[0]=nums[0];
    for(int i=1;i<n;i++){
        int take=nums[i];
        if(i>1){
            take+=dp[i-2];
        }
        int not_take=dp[i-1];
        dp[i]=Math.max(take,not_take);
    }
    return dp[n-1];
    }
}





