public class Solution {
    public static double findNthRootOfM(int n, long m) {
    	double high= m;
        double low=1;
        double e= 1e-7;
        
        while(high-low>e){
            double mid= low + (high-low)/2.0;
            if(multiply(mid,n)>(double)m)
                high=mid;
            else
                low=mid;
        }
        String s= String.format("%.6f",high);
        Double ans= Double.parseDouble(s);
        return ans;
    }
    
    public static double multiply(double mid,int n){
        double ans=1.0;
        while(n>0){
            ans*=mid;
            n--;
        }
        return ans;
    }
}