class Solution {
    public boolean isPalindrome(String s) {
        String cleanedString = "";

        for(char c : s.toCharArray()) {
            if(Character.isLetter(c) || Character.isDigit(c)) {
                cleanedString += c;
            }
        }

        cleanedString = cleanedString.toLowerCase();

        int a_pointer = 0;
        int b_pointer = cleanedString.length() - 1;

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
