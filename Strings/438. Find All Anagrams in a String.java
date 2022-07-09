class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> list=new ArrayList<>();
        if(s.length()==0 || p.length()==0 || p.length()>s.length())
            return list;
        
        int plen=p.length();
        for(int i=0;i<s.length()-plen+1;i++)
        {
            String str=s.substring(i,i+plen);
            if(isanagram(str,p)==true)
            {
                list.add(i);
            }
        }
        return list;
        
    }
    public boolean isanagram(String p, String q)
    {
        int[] arr=new int[26];
        for(int i=0;i<p.length();i++) arr[p.charAt(i)-'a']++;
        for(int i=0;i<q.length();i++) arr[q.charAt(i)-'a']--;
        for(int i:arr) if(i!=0) return false;
        return true;
    }
}
//27 lines, sliding window noob apporach 1550ms

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int[] map = new int[26];
        List<Integer> result = new ArrayList<>();
        
        for(int i=0;i<p.length();i++){
            map[p.charAt(i) - 'a']++;
        }
    
        int windowStart = 0;
        int windowEnd = 0;
        while(windowEnd<s.length()){
		// valid anagram
            if(map[s.charAt(windowEnd) - 'a'] > 0){
                map[s.charAt(windowEnd++) - 'a']--;
			// window size equal to size of P
                if(windowEnd-windowStart ==  p.length()){                    
                    result.add(windowStart);
                }
            }
			// window is of size 0
            else if(windowStart == windowEnd){
                windowStart ++;
                windowEnd ++;
            }
			// decrease window size
            else{
                map[s.charAt(windowStart++) - 'a']++;
            }      
        }
        return result;
    }
}
//33 lines, sliding window, O(S),7ms
