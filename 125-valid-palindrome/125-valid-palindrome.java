class Solution {
    public boolean isPalindrome(String s) {
        int j = s.length() - 1;
        for (int i = 0; i < j; i++) {
            while (!Character.isLetterOrDigit(s.charAt(i)) && i < j) {
                i++;
            }
            while (!Character.isLetterOrDigit(s.charAt(j)) && j > i) {
                j--;
            }
            if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) {
                return false;
            }
            j--;
        }
        return true;
    }
}