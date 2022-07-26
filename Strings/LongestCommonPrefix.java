class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0)
            return "";
        if(strs.length==1)
            return strs[0];
        int i = 0;
        String res = "";
        while(i<strs[0].length()){
            char ch = strs[0].charAt(i);
            for(String s:strs){
                if(i>=s.length() || s.charAt(i)!=ch)
                    return res;
            }
            res+= ch;
            i++;
        }
        return res;
    }
}