class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                int[] pair = new int[2];
                pair[0] = i;
                pair[1] = map.get(nums[i]);
                return pair;
            }
            map.put(target - nums[i], i);
        }
        return null;
    }
}