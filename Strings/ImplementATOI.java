class Solution {
    public int myAtoi(String s) {
        if(s.length()==0)
            return 0;
        long ans=0;
        int i=0;
        //Remove whitespaces
        while(i<s.length() && s.charAt(i)==' '){
            i++;
        }
        s= s.substring(i);
        if(s.length()==0)
            return 0;
        
        int sign=1;
        
        //checking for sign
        if(s.charAt(0)=='-')
            sign=-1;
        
        //if sign is present the iteration start from 1 else 0
        i= (s.charAt(0)=='+' || s.charAt(0)=='-')?1:0;
        while(i<s.length()){
            char ch= s.charAt(i);
            //if the character is not digit
            if(ch==' ' || (!isDigit(ch)))
                break;
            
            ans= ans*10 + (ch - '0');
            
            //if the number goes out of bounds for Int variable
            if(sign==-1 && -1*ans<Integer.MIN_VALUE)
                return Integer.MIN_VALUE;
            else if(sign==1 && ans>Integer.MAX_VALUE)
                return Integer.MAX_VALUE;
            i++;
        }
        return (int)(sign*ans);
    }
    
    public boolean isDigit(char ch){
        int i= ch-'0';
        if(i>=0 && i<=9)
            return true;
        return false;
    }
}