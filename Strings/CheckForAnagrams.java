//Using HashMap

class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()==0 && t.length()==0)
            return true;
        if(s.length()==0 || t.length()==0)
            return false;
        if(s.length()!=t.length())
            return false;
        
        HashMap<Character,Integer> map= new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch= s.charAt(i);
            if(map.containsKey(ch)){
                map.replace(ch,map.get(ch)+1);
            }
            else{
                map.put(ch,1);
            }
        }
        
        for(int i=0;i<t.length();i++){
            char ch= t.charAt(i);
            if(!map.containsKey(ch))
                return false;
            else{
                int val= map.get(ch)-1;
                if(val==0)
                    map.remove(ch);
                map.replace(ch,val);
            }
        }
        if(map.size()==0)
            return true;
        return false;
            
    }
}

//Using count array

public class Solution {
    public static boolean areAnagram(String s, String t){
        if(s.length()==0 && t.length()==0)
            return true;
        if(s.length()==0 || t.length()==0)
            return false;
        if(s.length()!=t.length())
            return false;
        
        int[] count= new int[26];
        
        for(char c: s.toCharArray()){
            count[c-'a']++;
        }
        
        for(char c: t.toCharArray()){
            count[c-'a']--;
        }
        
        for(int i=0;i<26;i++){
            if(count[i]!=0)
                return false;
        }
        return true;
    }
}