class Solution {
    public int romanToInt(String s) {
        if(s==null || s.length()==0) return -1;
        
        HashMap<Character, Integer> hs = new HashMap<Character, Integer>();
        hs.put('I',1);
        hs.put('V',5);
        hs.put('X',10);
        hs.put('L',50);
        hs.put('C',100);
        hs.put('D',500);
        hs.put('M',1000);
        
        int len=s.length();
        int result=hs.get(s.charAt(len-1));
        for(int i=len-2;i>=0;i--)
        {
            if(hs.get(s.charAt(i))>=hs.get(s.charAt(i+1)))
            {
                result+=hs.get(s.charAt(i));
            }
            else
            {
                result-=hs.get(s.charAt(i));
            }
        }
        return result;
    }
}
