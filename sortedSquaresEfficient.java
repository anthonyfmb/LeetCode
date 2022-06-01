class Solution {
    public int[] sortedSquares(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int[] sorted = new int[nums.length];
        int length = sorted.length;
        for (int i = length - 1; i >= 0; i--) {
            if (Math.abs(nums[left]) < Math.abs(nums[right])) {
                sorted[i] = nums[right] * nums[right];
                right--;
            }
            else {
                sorted[i] = nums[left] * nums[left];
                left++;
            }
        }
        
        return sorted;
    }
}
