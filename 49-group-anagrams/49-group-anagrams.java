class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list = new ArrayList<>();
        char[] alphabet = new char[26];
        
        for (int i = 0; i < strs.length; i++) {
            if (strs[i] == null) continue;
            List<String> curr = new ArrayList<>();
            curr.add(strs[i]);
            int length = strs[i].length();
            char[] ar = strs[i].toCharArray();
            Arrays.sort(ar);
            for (int j = i + 1; j < strs.length; j++) {
                if (strs[j] != null && length == strs[j].length()) {
                    char[] comp = strs[j].toCharArray();
                    Arrays.sort(comp);
                    if (Arrays.equals(ar, comp)) {
                        curr.add(strs[j]);
                        strs[j] = null;
                    }
                }
            }
            list.add(curr);
        }
        
        return list;
    }
    
}