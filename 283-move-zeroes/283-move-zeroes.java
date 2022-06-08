class Solution {
    public void moveZeroes(int[] nums) {
        int length = nums.length;
        int i = 0;
        int j = 0;
        int numZeros = 0;
        while (j < length) {
            nums[i] = nums[j];
            if (nums[i] != 0) {
                i++;
            }
            else {
                numZeros++;
            }
            j++;
        }
        
        for (int k = length - numZeros; k < length; k++) {
            nums[k] = 0;
        }
    }
}