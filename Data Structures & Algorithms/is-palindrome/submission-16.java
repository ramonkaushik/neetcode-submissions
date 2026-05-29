class Solution {
    public boolean isPalindrome(String s) {
        if(s.length() == 0) {
            return true;
        }

        String cleaned_string = new String();

        for(int i = 0; i < s.length(); i++) {
            if(Character.isDigit(s.charAt(i)) || Character.isLetter(s.charAt(i))) {
                cleaned_string += s.charAt(i);
                //System.out.println(cleaned_string);
            }
        }

        cleaned_string = cleaned_string.toLowerCase();

        int a_pointer = 0;
        int b_pointer = cleaned_string.length() - 1;

        //System.out.println(cleaned_string.length());

        while(a_pointer <= b_pointer) {
            if(cleaned_string.charAt(a_pointer) != cleaned_string.charAt(b_pointer)) {
                return false;
            }

            a_pointer++;
            b_pointer--;
        }

        return true;
    }
}
