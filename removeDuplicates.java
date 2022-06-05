class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        int lastNum = -101;
        int total = 0;
        int length = nums.length;
        for (int j = 0; j < length; j++) {
            if (nums[j] != lastNum) {
                lastNum = nums[j];
                nums[i] = nums[j];
                i++;
                total++;
            }
        }
        
        return total;
    }
}
