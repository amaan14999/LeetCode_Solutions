class Solution {
    public String reverseWords(String s) {
        if (s==null) return null;
        int len=s.length();
        char[] a=s.toCharArray();
        reverse(a,0,len-1);
        reversewords(a,len);
        return cleanspaces(a,len);
    }
        
        //reverse the entire string
        void reverse(char[] a, int startindex, int endindex)
        {
            while(startindex<endindex)
            {
                char start=a[startindex];
                a[startindex++]=a[endindex];
                a[endindex--]=start; 
            }
        }
        
        //reverse words
        void reversewords(char[] a, int len)
        {
            int i=0,j=0;
            while(i<len)
            {
                while(i<j || i<len && a[i]==' ') //skip leading white spaces
                {i++;}
                
                while(j<i || j<len && a[j]!=' ')//increment till a white space is found after a word
                {j++;}
                reverse(a,i,j-1);
                
            }
        }
        
        //cleaning white spaces
        public String cleanspaces(char[] a, int len)
        {
            int i=0,j=0;
            while(j<len)
            {
                while(j<len && a[j]==' ')
                    j++;
                
                while(j<len && a[j]!=' ')
                    a[i++]=a[j++];
                
                while(j<len && a[j]==' ')
                    j++;
                if(j<len)
                    a[i++]=' ';
            }
            return new String(a).substring(0,i);
        }
    }
