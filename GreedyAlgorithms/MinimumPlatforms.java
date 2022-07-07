class Solution
{
    //Function to find the minimum number of platforms required at the
    //railway station such that no train waits.
    static int findPlatform(int arr[], int dep[], int n)
    {
        Arrays.sort(arr);
       Arrays.sort(dep);
       // add your code here
       int count=1;
    for (int i=1 , j=0;i<arr.length;){
        if (arr[i]>dep[j]){
         
            i++;
            j++;
            continue;
        }
        else{
            i++;
            count++;
        }
    }
    return count;
        
    }
    
}
