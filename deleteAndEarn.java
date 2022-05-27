import java.util.HashMap;

class Solution {
    HashMap<Integer, Integer> order = new HashMap<>();
    HashMap<Integer, Integer> memo = new HashMap<>();

    public int deleteAndEarn(int[] nums) {
        int maxNumber = 0;
        for (int num : nums) {
            order.put(num, order.getOrDefault(num, 0) + num);
            maxNumber = Math.max(maxNumber, num);
        }
        
        return deleteHelper(maxNumber);
    }
    
    private int deleteHelper(int num) {
        if (num == 0) return 0;
        if (num == 1) return order.getOrDefault(1, 0);
        if (memo.containsKey(num)) return memo.get(num);
        
        int curr = order.getOrDefault(num, 0);
        memo.put(num, Math.max(deleteHelper(num - 1), deleteHelper(num - 2) + curr));
        return memo.get(num);
    }
}
