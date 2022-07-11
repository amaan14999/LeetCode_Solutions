class Solution {
    public void moveZeroes(int[] nums) {
        if(nums==null || nums.length==0)
            return;
        int curr=0;
        for(int i=0;i<nums.length;++i)
        {
            if(nums[i]!=0)
            {
                int temp=nums[curr];
                nums[curr++]=nums[i];
                nums[i]=temp;
            }
        }
    }
}
//16 lines, O(N) time, O(1) space, 1ms
