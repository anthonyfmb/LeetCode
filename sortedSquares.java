
class Solution {
    public int[] sortedSquares(int[] nums) {
        int length = nums.length;
        int[] ans = new int[length];
        for (int i = 0; i < length; i++) {
            ans[i] = nums[i] * nums[i];
        }

        Array.sort(ans);
        return ans;
    }
}


