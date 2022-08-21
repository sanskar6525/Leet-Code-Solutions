class Solution {
public int[][] floodFill(int[][] image, int sr, int sc, int color) {
int source_color = image[sr][sc];
if(source_color == color)
return image;
dfs(image,source_color,color,sr,sc);
return image;
}
public void dfs(int[][] image,int source_color,int color,int sr,int sc)
{
if(sr<0 || sr>=image.length || sc<0 || sc>=image[0].length)
{
return;
}
if(source_color != image[sr][sc])
{
return;
}
image[sr][sc] = color;
dfs(image,source_color,color,sr+1,sc);
dfs(image,source_color,color,sr-1,sc);
dfs(image,source_color,color,sr,sc+1);
dfs(image,source_color,color,sr,sc-1);
}
}
