class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.add(')');
            }
            else if (s.charAt(i) == '{') {
                stack.add('}');
            }
            else if (s.charAt(i) == '[') {
                stack.add(']');
            }
            else {
                if (stack.size() == 0 || stack.pop() != s.charAt(i)) {
                    return false;
                }
            }
        }
        
        return stack.size() == 0;
    }
}