class Solution {
    public String mergeAlternately(String word1, String word2) {
        // [1, 100]
        // only lowercase letters

        // Testcase 1:
        // word1 = "abc"
        // word2 = "xyz"
        // desired solution = "axbycz"
        // test = 

        StringBuilder solution = new StringBuilder();
        int a_pointer = 0;
        int b_pointer = 0;

        while(a_pointer < word1.length() && b_pointer < word2.length()) {
            solution.append(word1.charAt(a_pointer));
            a_pointer++;
            
            solution.append(word2.charAt(b_pointer));
            b_pointer++;
        }

        // if word1 has reached the end and word2 has not -> append rest of word2. Vice versa.
        if(a_pointer == word1.length() && b_pointer != word2.length()) {
            solution.append(word2.substring(b_pointer, word2.length()));
        }
        else if(b_pointer == word2.length() && a_pointer != word1.length()) {
            solution.append(word1.substring(a_pointer, word1.length()));
        }

        return solution.toString();
    }
}