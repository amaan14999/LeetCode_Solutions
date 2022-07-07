class Solution {
    public String simplifyPath(String path) {
        Stack<String> st=new Stack<>();
        String[] s=path.split("/");
        
        for(int i=0;i<s.length;i++)
        {
            if(!st.empty() && s[i].equals(".."))
                st.pop();
            
            else if(!s[i].equals(".") && !s[i].equals("") && !s[i].equals(".."))
                st.push(s[i]);
        }
        List<String> list =new ArrayList(st);
        return "/"+String.join("/", list);
    }
}
