func isPalindrome(s string) bool {
    // clean string (lower case and white space)
    s = strings.ToLower(s)
    s = strings.TrimSpace(s)

    // create cleaned string rune slice
    cleaned_string := []rune{}

    // only gather letters and digits
    for _, c := range(s) {
        if unicode.IsLetter(c) || unicode.IsDigit(c) {
            cleaned_string = append(cleaned_string, c)
        }
    }

    // declare a and b pointer
    a_pointer := 0
    b_pointer := len(cleaned_string) - 1

    // iterate over cleaned string and verify letters are equal
    for a_pointer <= b_pointer {
        if cleaned_string[a_pointer] != cleaned_string[b_pointer] {
            return false
        }

        a_pointer++
        b_pointer--
    }
    return true
}
