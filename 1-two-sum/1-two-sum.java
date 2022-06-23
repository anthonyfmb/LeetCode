class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] pair = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                pair[0] = i;
                pair[1] = map.get(nums[i]);
                return pair;
            }
            int opp = target - nums[i];
            map.put(opp, i);
        }
        return pair;
    }
}