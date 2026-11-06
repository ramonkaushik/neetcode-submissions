class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> anagrams = new HashMap<>();
        

        for(int i = 0; i < strs.length; i++) {
            int[] letterCounter = new int[26];


            for(char c : strs[i].toCharArray()) {
                letterCounter[c - 'a']++;
            }


            anagrams.putIfAbsent(Arrays.toString(letterCounter), new ArrayList<String>());
            anagrams.get(Arrays.toString(letterCounter)).add(strs[i]);
        }

        return new ArrayList<>(anagrams.values());
    }
}
