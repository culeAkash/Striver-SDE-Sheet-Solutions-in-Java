class Solution
{
    //Function to get the maximum total value in the knapsack.
    double fractionalKnapsack(int W, Item arr[], int n) 
    {
        Arrays.sort(arr,new Comp());
        int i=0;
        double profit =0;
        while(W>0 && i<arr.length){
            if(W>=arr[i].weight){
                W-=arr[i].weight;
                profit+=arr[i].value;
            }
            else{
                profit+= ((double)arr[i].value/(double)arr[i].weight)*W;
                break;
            }
            i++;
        }
        return profit;
    }
}

class Comp implements Comparator<Item>{
    public int compare(Item i1,Item i2){
        double r1 = (double)i1.value/(double)i1.weight;
        double r2 = (double)i2.value/(double)i2.weight;
        
        if(r2>r1)
            return 1;
        else
            return -1;
        
    }
    
}