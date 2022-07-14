class Solution {
    public int numIslands(char[][] grid) {
        int count=0;
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(!visited[i][j] && grid[i][j]!='0'){
                    count++;
                    dfs(grid,visited,i,j);
                }
            }
        }
        return count;
    }
    
    public void dfs(char[][] grid,boolean[][] visited,int i,int j){
        visited[i][j] = true;
        
        if(i-1>=0 && !visited[i-1][j] && grid[i-1][j]!='0')
            dfs(grid,visited,i-1,j);
        
        if(i+1<grid.length && !visited[i+1][j] && grid[i+1][j]!='0')
            dfs(grid,visited,i+1,j);
        
        if(j-1>=0 && !visited[i][j-1] && grid[i][j-1]!='0')
            dfs(grid,visited,i,j-1);
        
        if(j+1<grid[0].length && !visited[i][j+1] && grid[i][j+1]!='0')
            dfs(grid,visited,i,j+1);
        
    }
}


//No extra space solution

class Solution {
    public int numIslands(char[][] grid) {
        int count=0;
        
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1'){
                    count++;
                    dfs(grid,i,j);
                }
            }
        }
        return count;
    }
    
    public void dfs(char[][] grid,int i,int j){
        if(i<0 || i>=grid.length || j<0 || j>=grid[0].length || grid[i][j]!='1')
            return;
        
        grid[i][j] = '0';
        
            dfs(grid,i-1,j);
        
       
            dfs(grid,i+1,j);
        
        
            dfs(grid,i,j-1);
        
        
            dfs(grid,i,j+1);
        
    }
}