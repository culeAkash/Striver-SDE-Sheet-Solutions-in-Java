public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> repeatedNumber(final List<Integer> A) {
        long len = A.size();
        
        long sumLin = (long)(len * (len+1) ) /2;
        long sumSq = (long)(len * (len +1) *(2*len +1) )/6;;
        
        
        for(int i=0;i<len;i++){
            sumLin -= (long)A.get(i);
            sumSq -= (long)A.get(i)*(long)A.get(i);
        }
        
        long miss = (sumLin + sumSq/sumLin)/2;
        long repeat = miss - sumLin;
        
        ArrayList<Integer> ans = new ArrayList<>();
        
        ans.add((int)repeat);
        ans.add((int)miss);
        
        return ans;
    }
}
