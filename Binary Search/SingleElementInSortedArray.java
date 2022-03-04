class Solution {
    public int singleNonDuplicate(int[] arr) {
        if(arr.length==1){
            return arr[0];
        }   
        int start=0,end=arr.length-2;
        while(start<=end){
            int mid= start + (end-start)/2;
            if(arr[mid]== arr[mid^1])
                start=mid+1;
            else
                end=mid-1;
        }
        return arr[start];
    }
}