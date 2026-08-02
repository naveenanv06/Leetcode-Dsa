class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int max=Integer.MIN_VALUE;
        int count=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    max=Math.max(max,dfs(grid,i,j));
                    
                }
            }
        }
        if(max==Integer.MIN_VALUE) return 0;
        return max;
    }
    private int dfs(int[][]g,int r,int c){
            if(r<0||c<0||r>=g.length||c>=g[0].length) return 0;
            if(g[r][c]!=1) return 0;
            g[r][c]=0;
            
            return 1+dfs(g,r-1,c)+dfs(g,r+1,c)+dfs(g,r,c-1)+dfs(g,r,c+1);
            
    }
}