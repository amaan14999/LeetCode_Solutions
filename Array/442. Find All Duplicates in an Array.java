class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashSet<Integer>set=new HashSet<>();
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            if(!set.add(nums[i]))
            {
                list.add(nums[i]);
            }
            set.add(nums[i]);
        }
        return list;
    }
}


class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer, Integer>map=new HashMap<>();
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            if(map.containsKey(nums[i]))
            {
                list.add(nums[i]);
            }
            map.put(nums[i],i);
        }
        return list;
    }
}
