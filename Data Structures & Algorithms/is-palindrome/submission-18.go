func isPalindrome(s string) bool {
    // String cleaning
    s = strings.ToLower(s)
    s = strings.ReplaceAll(s, " ", "")
    
    sToRuneArray := []rune(s)
    
    cleaned_string := []rune{}

    for _, char := range sToRuneArray {
        if unicode.IsLetter(char) || unicode.IsDigit(char) {
            cleaned_string = append(cleaned_string, char)
        }
    }

    a_pointer := 0
    b_pointer := len(cleaned_string) - 1

    for a_pointer < b_pointer {
        if cleaned_string[a_pointer] != cleaned_string[b_pointer] {
            return false
        }
        a_pointer++
        b_pointer--
    }

    return true
}
