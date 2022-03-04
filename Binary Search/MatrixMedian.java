import java.util.ArrayList;

public class Solution
{
	public static int getMedian(ArrayList<ArrayList<Integer>> matrix)
	{
		int low=0;
        int high= (int)1e9;
        int n= matrix.size();
        int m= matrix.get(0).size();
        
        while(low<=high){
            int mid= low + (high-low)/2;
            int count=0;
            for(int i=0;i<n;i++){
                count+= countNumbersLessEqualtoMid(matrix.get(i),mid);
            }
            if(count<=(n*m)/2)
                low=mid+1;
            else
                high=mid-1;
        }
        return low;
	}
    
    public static int countNumbersLessEqualtoMid(ArrayList<Integer> arr,int mid){
        int l=0,h=arr.size()-1;
        while(l<=h){
            int md= l + (h-l)/2;
            if(arr.get(md)<=mid)
                l=md+1;
            else
                h=md-1;
        }
        return l;
    }
}