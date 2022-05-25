import java.util.HashMap;

class Solution {
    HashMap<Object, Integer> memo = new HashMap<>();
    public int rob(int[] nums) {
        return robHelper(nums, nums.length - 1, memo);
    }
    private int robHelper(int[] nums, int index, HashMap memo) {
        if (memo.containsKey(index)) {
            return (int) memo.get(index);
        } 
        if (index < 0) return 0;
        if (index == 0) return nums[index];
        
        int result_one = robHelper(nums, index - 1, memo);
        int result_two = robHelper(nums, index - 2, memo) + nums[index];
        if (result_one > result_two) {
            memo.put(index, result_one);
            return result_one;
        }
        memo.put(index, result_two);
        return result_two;
    }
}
