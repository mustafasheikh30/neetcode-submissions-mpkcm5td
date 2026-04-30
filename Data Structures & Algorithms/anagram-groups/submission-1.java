
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        
        for(String word : strs) {
            
            // Step 1: convert to char array
            char[] chars = word.toCharArray();
            
            // Step 2: sort characters
            Arrays.sort(chars);
            
            // Step 3: convert back to string
            String key = new String(chars);
            
            // Step 4: store in map
            if(!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            
            map.get(key).add(word);
        }
        
        // return all grouped values
        return new ArrayList<>(map.values());
    }
}