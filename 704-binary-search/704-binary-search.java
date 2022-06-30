class Solution {
    public int search(int[] nums, int target) {
        int length = nums.length;
        int middleIndex = length / 2;
        int leftEdge = 0;
        int rightEdge = length - 1;
        while (leftEdge <= rightEdge) {
            if (nums[middleIndex] == target) return middleIndex;
            else if (nums[middleIndex] < target) {
                leftEdge = middleIndex + 1;
                middleIndex = leftEdge + (rightEdge - leftEdge)/2;
            }
            else if (nums[middleIndex] > target) {
                rightEdge = middleIndex - 1;
                middleIndex = (rightEdge - leftEdge) / 2;
            }
        }
        
        return -1;
    }
}