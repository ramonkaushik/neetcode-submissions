class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> anagramMap = new HashMap<>();

        for(String str : strs) {
            int[] letterCounter = new int[26];

            for(char c : str.toCharArray()) {
                letterCounter[c - 'a']++;
            }

            anagramMap.putIfAbsent(Arrays.toString(letterCounter), new ArrayList<String>());

            anagramMap.get(Arrays.toString(letterCounter)).add(str);
        }

        return new ArrayList<>(anagramMap.values());
    }
}
