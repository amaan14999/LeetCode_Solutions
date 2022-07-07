class Solution {
    public List<String> generateParenthesis(int n) {
        ArrayList<String> ans =new ArrayList();
        generatepara(n,0,0,"",ans);
        return ans;
        
    }
    public void generatepara(int n, int open, int close, String s, ArrayList<String> ans)
    {
        if(open==n && close==n)
        {
            ans.add(s);
            return;
        }
        
        
        if(open<n)
        {
            generatepara(n,open+1,close,s+"(",ans);
        }
        
        if(close<open)
        {
            generatepara(n,open,close+1,s+")",ans);
        }
    }
}
