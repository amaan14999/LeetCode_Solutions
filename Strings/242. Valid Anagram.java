//2ms approach, increasing and decreasing char value in array itself

class Solution {
    public boolean isAnagram(String s, String t) {
        int[] ans= new int[26];
        for(int i=0;i<s.length();i++) ans[s.charAt(i)-'a']++;
        for(int i=0;i<t.length();i++) ans[t.charAt(i)-'a']--;
        for(int i:ans) if(i!=0) return false;
        return true;
    }
}


//using hashmap
class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map= new HashMap<Character, Integer>();
        if(s.length()==0 || t.length()==0 || s.length()!=t.length())
            return false;
        
        //fill the map with the alphabets of the 1st string and the frequency of each alphabet
        for(int i=0; i<s.length();i++)
        {
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        
        //check if the alphabets of string two are already present in the map with the same frequency
        for(int i=0; i<t.length();i++)
        {
            char ch=t.charAt(i);
            
            //if the 2nd string consists of any alphabets which is not present in map, then it is not an anagram
            if(map.containsKey(ch)==false)
                return false;
            
            //if the frequency of that alphabet si 1, then remove it
            else if(map.get(ch)==1)
                map.remove(ch);
            
            //else decrease the frequency of alphabet in the map
            else
            {
                map.put(ch,map.get(ch)-1);
            }
        }
        
        //if the size of map in the end is 0, i.e., map is empty, the strin is anagram
        return map.size()==0;
    }
}
