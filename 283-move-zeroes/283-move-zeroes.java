class Solution {
    public void moveZeroes(int[] nums) {
        int length = nums.length;
        int i = 0;
        int numZeros = 0;
        for (int j = 0; j < length; j++) {
            nums[i] = nums[j];
            if (nums[i] != 0) {
                i++;
            }
            else {
                numZeros++;
            }
        }
        
        for (int k = length - numZeros; k < length; k++) {
            nums[k] = 0;
        }
    }
}