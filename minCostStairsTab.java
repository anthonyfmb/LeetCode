class Solution {
    HashMap<Integer, Integer> memo = new HashMap<>();
    
    public int minCostClimbingStairs(int[] cost) {
        int minimumCost[] = new int[cost.length + 1];
        
        for (int i = 2; i < minimumCost.length; i++) {
            int oneStep = minimumCost[i - 1] + cost[i - 1];
            int twoStep = minimumCost[i - 2] + cost[i - 2];
            minimumCost[i] = Math.min(oneStep, twoStep);
        }
        
        return minimumCost[minimumCost.length - 1];
    }
}
