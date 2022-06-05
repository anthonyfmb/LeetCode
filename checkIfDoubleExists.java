// There is no official solution for this problem, but this beats 82% of submissions.

class Solution {
    public boolean checkIfExist(int[] arr) {
        int length = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < length; i++) {
            map.put(2 * arr[i], i);
            if (map.containsKey(arr[i]) && map.get(arr[i]) != i) return true;
        }
        
        for (int i = 0; i < length; i++) {
            if (map.containsKey(arr[i]) && map.get(arr[i]) != i) return true;
        }
        return false;
    }
}
