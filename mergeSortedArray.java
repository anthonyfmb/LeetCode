class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] merged = new int[m + n];
        int indexOne = 0;
        int indexTwo = 0;
        for (int i = 0; i < m + n; i++) {
            if (m <= indexOne) {
                merged[i] = nums2[indexTwo];
                indexTwo++;
            }
            else if (n <= indexTwo) {
                merged[i] = nums1[indexOne];
                indexOne++;
            }
            else if (nums1[indexOne] < nums2[indexTwo]) {
                merged[i] = nums1[indexOne];
                indexOne++;
            }
            else {
                merged[i] = nums2[indexTwo];
                indexTwo++;
            }
        }
        for (int i = 0; i < m + n; i++) {
            nums1[i] = merged[i];
        }
    }
}
