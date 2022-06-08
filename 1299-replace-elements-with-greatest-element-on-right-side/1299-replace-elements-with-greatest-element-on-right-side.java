class Solution {
    public int[] replaceElements(int[] arr) {
        int length = arr.length;
        int biggestInt = -1;
        int temp = 0;
        for (int i = length - 1; i >= 0; i--) {
            temp = arr[i];
            arr[i] = biggestInt;
            biggestInt = Math.max(biggestInt, temp);
        }
        
        return arr;
    }
}