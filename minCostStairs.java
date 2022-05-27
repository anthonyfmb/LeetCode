class Solution {
    HashMap<Integer, Integer> memo = new HashMap<>();
    
    public int minCostClimbingStairs(int[] cost) {
        return minCostHelper(cost, cost.length);
    }
    
    private int minCostHelper(int[] cost, int index) {
        if (index <= 1) return 0;
        if (memo.containsKey(index)) return (int) memo.get(index);
        int oneStep = cost[index - 1] + minCostHelper(cost, index - 1);
        int twoSteps = cost[index - 2] + minCostHelper(cost, index - 2);
        memo.put(index, Math.min(oneStep, twoSteps));
        return memo.get(index);
    }
}
