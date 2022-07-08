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
