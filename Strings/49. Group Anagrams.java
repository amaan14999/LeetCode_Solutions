//HASHMAP APPROACH, 10ms
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map=new HashMap<>();
        for(int i=0;i<strs.length;i++)
        {
            String s1=strs[i];
            char[] arr= s1.toCharArray();
            Arrays.sort(arr);
            String str= new String(arr);
            
            if(map.containsKey(str))
            {
                map.get(str).add(s1);
            }
            else
            {
                map.put(str, new ArrayList<>());
                map.get(str).add(s1);
            }
            
        }
        return new ArrayList<>(map.values());
    }
}


//HASHMAP with frequency map inside it.
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<HashMap<Character, Integer>, ArrayList<String>> bmap= new HashMap<>();
        for(String str:strs)
        {
            HashMap<Character, Integer> fmap=new HashMap<>();
            for(int i=0;i<str.length();i++)
            {
                char ch=str.charAt(i);
                fmap.put(ch,fmap.getOrDefault(ch,0)+1);
            }
            if(bmap.containsKey(fmap)==false)
            {
                ArrayList<String> list= new ArrayList<>();
                list.add(str);
                bmap.put(fmap,list);
            }
            else
            {
                ArrayList<String> list= bmap.get(fmap);
                list.add(str);
            }
        }
        List<List<String>> res=new ArrayList<>();
        for(ArrayList<String> val:bmap.values()){
            res.add(val);
        }
        return res;
    }
}
