class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<Pair> rotten = new LinkedList<Pair>();
        
        int[][] directions = new int[][]{{0,-1},{0,1},{-1,0},{1,0}};
        /*
            0,-1 => left
            0,1 => right
            -1,0 =>up
            1,0 => down
        */
        
        //find all fresh and already rotten oranges
        int fresh = 0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1)
                    fresh++;
                else if(grid[i][j]==2)
                    rotten.offer(new Pair(i,j));
            }
        }
        
        
        //Now make bfs call and find time to rot all oranges
        //All already rotten oranges will start rotten the nearby oranges simultaneously
        int timer = 0;
        while(!rotten.isEmpty()){
            //all already rotten oranges will rot nearby simultanously and togethr take 1 min
            int size = rotten.size();
            while(size-- > 0){
                Pair temp = rotten.poll();
                //go in all four directions and rot oranges
                for(int i=0;i<4;i++){
                    int row = temp.x + directions[i][0];
                    int col = temp.y + directions[i][1];
                    
                    //if the nearby orange is in the range and still fresh
                    if(row<0 || row>=grid.length || col<0 || col>=grid[0].length || grid[row][col]!=1)
                        continue;//go for next nearby orange
                    
                    //rot the orange
                    fresh--;
                    grid[row][col] = 0;//once rotten no need rot again
                    rotten.offer(new Pair(row,col));//in next min new rotten orange will rot nearby orange
                }
            }
            
            //if no oranges are rotten in this minute then dont increment counter
            if(rotten.size()>0)
                timer++;
        }
        
        if(fresh==0)
            return timer;
        return -1;
    }
}

class Pair{
    int x;
    int y;
    
    public Pair(int x,int y){
        this.x = x;
        this.y = y;
    }
}