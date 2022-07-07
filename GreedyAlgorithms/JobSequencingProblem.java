class Solution
{
    //Function to find the maximum profit and the number of jobs done.
    int[] JobScheduling(Job arr[], int n)
    {
        Arrays.sort(arr,new Comp());
        int size=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i].deadline>size)
                size = arr[i].deadline;
        }
        int[] occupied= new int[size+1];
        Arrays.fill(occupied,-1);
        
        int profit = 0;
        int count=0;
        for(int i=0;i<arr.length;i++){
            int deadline = arr[i].deadline;
            for(int j=deadline;j>=1;j--){
                if(occupied[j]==-1){
                    occupied[j] = arr[i].id;
                    profit+= arr[i].profit;
                    count++;
                    break;
                }
            }
        }
        return new int[]{count,profit};
    }
}

class Comp implements Comparator<Job>{
    public int compare(Job j1,Job j2){
        return j2.profit-j1.profit;
    }
}

/*
class Job {
    int id, profit, deadline;
    Job(int x, int y, int z){
        this.id = x;
        this.deadline = y;
        this.profit = z; 
    }
}
*/