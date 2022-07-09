class Solution {
    public List<String> removeAnagrams(String[] words) {
        String prev="";
        ArrayList<String> list=new ArrayList<>();
        for(int i=0;i<words.length;i++)
        {
            String s=words[i];
            char[] ch=s.toCharArray();
            Arrays.sort(ch);
            String curr=String.valueOf(ch);
            
            if(!curr.equals(prev))
            {
                list.add(s);
                prev=curr;
            }
        }
        return list;
    }
}
//21 lines, o(n), 4ms
