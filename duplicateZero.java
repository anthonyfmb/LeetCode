class Solution {
    public void duplicateZeros(int[] arr) {
        int length = arr.length;
        int[] tempArr = new int[length];
        int tempIndex = 0;
        int index = 0;
        while (tempIndex < length) {
            if (arr[index] == 0) {
                tempArr[tempIndex] = 0;
                if (tempIndex + 1 < length) tempArr[++tempIndex] = 0;
                tempIndex++;
                index++;
            }
            else {
                tempArr[tempIndex++] = arr[index++];
            }
        }
        
        for (int i = 0; i < length; i++) {
            arr[i] = tempArr[i];
        }
    }
}
