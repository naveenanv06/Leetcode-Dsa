class Solution {
    public int rob(int[] nums) {
        if (nums.length == 1)
            return nums[0];
        int n=nums.length-1;
        return Math.max(check(nums,0,n-1),check(nums,1,n));

    }
    private int check(int[] arr,int st,int end){
        int len=end-st+1;
        if(len==1) return arr[st];
        int[] dp=new int[len+1];
        dp[0]=arr[st];
        dp[1]=Math.max(arr[st],arr[st+1]);
        for(int i=2;i<len;i++){
            dp[i]=Math.max(dp[i-1],dp[i-2]+arr[st+i]);
        }
        return dp[len-1];
    }
}