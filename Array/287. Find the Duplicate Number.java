class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        for (int i = 1; i < len; i++) {
            if (nums[i] == nums[i - 1]) {
                return nums[i];
            }
        }

        return len;
    }
}
//13 lines, sorting apporach, Time Complexity: O(nlogn), Space Complexity: O(logn), 41ms
