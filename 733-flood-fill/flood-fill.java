class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int org=image[sr][sc];
        if(org==color) return image;
        dfs(image,sr,sc,color,org);
        return image;
    }
    private void dfs(int[][] img,int r,int c,int color,int org){
        if(r<0||r>=img.length||c<0||c>=img[0].length){
            return;
        }
        if(img[r][c]!=org) return;
        img[r][c]=color;
        dfs(img,r-1,c,color,org);
        dfs(img,r+1,c,color,org);
        dfs(img,r,c-1,color,org);
        dfs(img,r,c+1,color,org);
    }
}