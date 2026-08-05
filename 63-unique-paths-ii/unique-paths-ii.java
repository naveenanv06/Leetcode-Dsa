class Solution {
    public int uniquePathsWithObstacles(int[][] og) {
        
        if(og[0][0]==1) return 0;
        int[][]dp =new int[og.length][og[0].length];
        dp[0][0]=1;
        for(int i=0;i<og.length;i++){
            for(int j=0;j<og[0].length;j++){
                if(og[i][j]==1) dp[i][j]=0;
                else if(!(i==0&&j==0)){
                    int up=i>0?dp[i-1][j]:0;
                    int l=j>0?dp[i][j-1]:0;
                    dp[i][j]=up+l;
                }
            }
        }
        return dp[og.length-1][og[0].length-1];
    }
}