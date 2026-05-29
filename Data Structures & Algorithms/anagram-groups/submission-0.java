class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // declare solution hashmap
        HashMap<String, List<String>> output = new HashMap<>();

        // iterate through array of strings
        for(int i = 0; i < strs.length; i++) {
            // count letters of each word
            int[] letterCounter = new int[26];

            // increment occurances of letters scene
            for(int j = 0; j < strs[i].length(); j++) {
                letterCounter[strs[i].charAt(j) - 'a']++;
            }

            String key = Arrays.toString(letterCounter);
            output.putIfAbsent(key, new ArrayList<String>());
            output.get(key).add(strs[i]);
        }

        return new ArrayList<>(output.values());
    }
}
