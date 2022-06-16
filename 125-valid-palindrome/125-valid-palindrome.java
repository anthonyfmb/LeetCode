class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        s = s.toLowerCase();
        int length = s.length();
        int index = 0;
        for (int i = length - 1; i >= length/2; i--) {
            if (!s.substring(i, i+1).equals(s.substring(index, index+1))) {
                return false;
            }
            index++;
        }
        return true;
    }
}