class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) {
            return new ArrayList<>();
        }
        
        Map<String, List<String>> map = new HashMap<>();
        
        for (String s : strs) {
            // Convert string to character array, sort it, and convert back to string
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String sortedKey = new String(charArray);
            
            // If the key doesn't exist, initialize a new list
            map.putIfAbsent(sortedKey, new ArrayList<>());
            
            // Add the original string to its corresponding anagram group
            map.get(sortedKey).add(s);
        }
        
        return new ArrayList<>(map.values());
    }
}