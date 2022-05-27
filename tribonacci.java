class Solution {
    public int tribonacci(int n) {
        int array[] = new int[n + 4];
        array[0] = 0;
        array[1] = 1;

        for (int i = 0; i < n + 1; i++) {
            array[i + 1] += array[i];
            array[i + 2] += array[i];
            array[i + 3] += array[i];
        }
        
        return array[n];
    }
}
