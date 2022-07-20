class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        if (k == nums.length) return nums;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer>[] list = new List[nums.length + 1];

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        for (int key : map.keySet()) {
            int val = map.get(key);
            if (list[val] == null) {
                list[val] = new ArrayList<>();
            }
            list[val].add(key);
        }
        
        int[] result = new int[k];
        int index = 0;

        for (int i = list.length - 1; index < k && i >= 0; i--) {
            if (list[i] != null) {
                for (int j = 0; j < list[i].size(); j++) {
                    result[index] = list[i].get(j);
                    index++;
                }
            }
        }

        return result;
    }
}