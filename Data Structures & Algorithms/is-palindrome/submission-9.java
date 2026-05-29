class Solution {
    public boolean isPalindrome(String s) {
        // clean string 
        String cleanedString = "";

        for(char c : s.toCharArray()) {
            if(Character.isLetterOrDigit(c)) {
                cleanedString += c;
            }
        }

        cleanedString = cleanedString.toLowerCase();

        // declare pointers
        int a_pointer = 0;
        int b_pointer = cleanedString.length() - 1;

        // iterate through string and return false if pointers are not equal
        while(a_pointer < b_pointer) {
            if(cleanedString.charAt(a_pointer) != cleanedString.charAt(b_pointer)) {
                return false;
            }
            a_pointer++;
            b_pointer--;
        }
        return true;

    }
}
