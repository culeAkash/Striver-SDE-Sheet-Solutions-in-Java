// User function Template for Java

// m is the given matrix and n is the order of matrix
class Solution {
    public static ArrayList<String> findPath(int[][] maze, int n) {
        String move="";//To keep track of the path
        ArrayList<String> ans= new ArrayList<>();
        boolean[][] visited= new boolean[n][n];//so that in one path a cell is only entered once otherwise infinite looping will happen
        if(maze[0][0]==1){
            solve(maze,0,0,visited,n,ans,move);
        }
        return ans;
    }
    
    public static void solve(int[][] maze,int row,int col,boolean[][] visited,int n, ArrayList<String> ans, String move){
        if(row==n-1 && col==n-1){
            ans.add(move);
            return;
        }
        
        //We have to return the answer lexicographically so we will traverse in that order too
        
        //Downward
        //We have to check for array index bounds,visited and maze[0] condition
        if(row+1<n && !visited[row+1][col] && maze[row+1][col]==1){
            visited[row+1][col]=true;//mark as visited so cant be visited again in the same recursion tree
            solve(maze,row+1,col,visited,n,ans,move+"D");
            //backtrack
            visited[row+1][col]=false;
        }
        
        //Left
        if(col-1>=0 && !visited[row][col-1] && maze[row][col-1]==1){
            visited[row][col-1]=true;
            solve(maze,row,col-1,visited,n,ans,move+"L");
            //backtrack
            visited[row][col-1]=false;
        }
        
        //Right
        if(col+1<n && !visited[row][col+1] && maze[row][col+1]==1){
            visited[row][col+1]=true;
            solve(maze,row,col+1,visited,n,ans,move+"R");
            //backtrack
            visited[row][col+1]=false;
        }
        
        //Up
        if(row-1>=0 && !visited[row-1][col] && maze[row-1][col]==1){
            visited[row-1][col]=true;
            solve(maze,row-1,col,visited,n,ans,move+"U");
            //backtrack
            visited[row-1][col]=false;
        }
    }
}
