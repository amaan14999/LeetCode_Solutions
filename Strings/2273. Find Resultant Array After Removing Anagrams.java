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


class Solution {
    public List<String> removeAnagrams(String[] words) {
        Stack<String> stack=new Stack<>();
        for(int i=words.length-1;i>=0;i--)
        {
            String s=words[i];
            if(!stack.isEmpty()&& isanagram(stack.peek(),s)==true)
            {
                stack.pop();
            }
            stack.push(s);
        }
        ArrayList<String> list=new ArrayList<>();
        while(!stack.isEmpty())
        {
            list.add(stack.pop());
        }
        return list;
    }
    
    public boolean isanagram(String p, String q)
    {
        int[] ans=new int[26];
        for(int i=0;i<p.length();i++) ans[p.charAt(i)-'a']++;
        for(int i=0;i<q.length();i++) ans[q.charAt(i)-'a']--;
        for(int i:ans) if(i!=0) return false;
        return true;
    }
}

//29 lines, O(m+n), 7ms
