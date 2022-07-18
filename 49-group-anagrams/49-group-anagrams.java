class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        List<List<String>> result = new ArrayList<>();
        for (String s : strs) {
            char[] letters = new char[26];
            
            for (int i = 0; i < s.length(); i++) {
                letters[s.charAt(i) - 'a']++;    
            }
            String hash = new String(letters);
            if (map.containsKey(hash)) {
                map.get(hash).add(s);
            }
            else {
                List<String> list = new ArrayList<>();
                list.add(s);
                map.put(hash, list);
            }
            
        }
        result.addAll(map.values());
        return result;
    }
    
}