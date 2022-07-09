class Solution {
    public boolean isPalindrome(String s) {
        s=s.replaceAll("[^a-zA-Z0-9]","");
        s=s.toLowerCase();
        int i=0;
        int j=s.length()-1;
        while(i<j)
        {
            if(s.charAt(i)==s.charAt(j))
            {
                i++;
                j--;
            }
            else return false;
        }
        return true;
    }
}
//18 lines, o(n), 798ms

class Solution {
    public boolean isPalindrome(String s) {
        int start=0;
        int end=s.length()-1;
        while(start<end)
        {
            char head=s.charAt(start);
            char tail=s.charAt(end);
            if(!Character.isLetterOrDigit(head))
            {
                start++;
            }
            else if(!Character.isLetterOrDigit(tail))
            {
                end--;
            }
            else 
            {
                if(Character.toLowerCase(head)!=Character.toLowerCase(tail))
                {
                    
                    return false;
                }
                start++;
                end--;
            }
            
        }
        return true;
    }
}
//20 lines, O(n), 3ms
