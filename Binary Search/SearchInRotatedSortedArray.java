class Solution {
    public int search(int[] arr, int target) {
        int start=0,end=arr.length-1;
        while(start<=end){
            int mid= start + (end-start)/2;
            //Left side sort condition
            if(arr[mid]==target)
                return mid;
            if(arr[start]<=arr[mid]){
                if(target>=arr[start] && target<arr[mid]){//Present in left half
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
            else{//If left side is not sorted then right side must be sorted
                if(target<=arr[end] && target>arr[mid])
                    start=mid+1;//if present in right side search in there
                else//search in left side
                    end=mid-1;
            }
        }
        return -1;
    }
}