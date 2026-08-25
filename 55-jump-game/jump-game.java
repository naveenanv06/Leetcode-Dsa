class Solution {
    public boolean canJump(int[] nums) {
       boolean[]dp=new boolean[nums.length];
       dp[0]=true;
       int i=0;
       while(i<nums.length-1){
            if(dp[i]){  
                for(int j = 1; j <= nums[i] && i + j < nums.length; j++){
                    dp[i+j]=true;
                }
                
            }
            i++;
       }
       return dp[nums.length-1];
    }
}