class Solution {
    public boolean isPalindrome(String s) {
        // clean string -> just grab letters
        String cleaned_string = "";

        for(char c : s.toCharArray()) {
            if(Character.isLetterOrDigit(c)) {
                cleaned_string += c;
            }
        }

        cleaned_string = cleaned_string.toLowerCase();

        System.out.println(cleaned_string);

        int a_pointer = 0;
        int b_pointer = cleaned_string.length() - 1;

        // iterate through string, ensuring the values are equal
        while(a_pointer < b_pointer) {
            if(cleaned_string.charAt(a_pointer) != cleaned_string.charAt(b_pointer)) {
                return false;
            }
            a_pointer++;
            b_pointer--;
        }
        return true;
    }
}
