class Solution {
    public int maxSubArray(int[] nums) {
        int maxSub = nums[0];
        int currentSub = maxSub;
        for (int i = 1; i < nums.length; i++) {
            if (currentSub < 0) currentSub = nums[i];
            else currentSub = currentSub + nums[i];
            maxSub = Math.max(maxSub, currentSub);
        }
        return maxSub;
    }
}