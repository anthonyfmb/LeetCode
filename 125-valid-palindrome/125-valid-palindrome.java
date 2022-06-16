class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        s = s.toLowerCase();
        System.out.println(s);
        int length = s.length();
        //String beg = s.substring(0, length/2);
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