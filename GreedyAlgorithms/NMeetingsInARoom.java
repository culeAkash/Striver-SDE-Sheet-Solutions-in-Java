class Solution 
{
    //Function to find the maximum number of meetings that can
    //be performed in a meeting room.
    public static int maxMeetings(int start[], int end[], int n)
    {
        PriorityQueue<Pair> pq = new PriorityQueue<>(new Comp());
        
        for(int i=0;i<start.length;i++)
            pq.offer(new Pair(start[i],end[i]));
            
        int max = 0;
        int count = 0;
        while(!pq.isEmpty()){
            Pair t = pq.poll();
            if(t.x>max){
                max = t.y;
                count++;
            }
        }
        return count;
    }
}

class Pair{
    int x,y;
    
    public Pair(int x,int y){
        this.x = x;
        this.y = y;
    }
}

class Comp implements Comparator<Pair>{
    public int compare(Pair p1,Pair p2){
        return p1.y-p2.y;
    }
}
