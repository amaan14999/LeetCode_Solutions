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
