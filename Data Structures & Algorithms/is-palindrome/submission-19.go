func isPalindrome(s string) bool {
    // clean up the string
    s = strings.ToLower(s)
    s = strings.TrimSpace(s)

    // convert to rune array
    sToRuneArray := []rune(s)

    // make rune slice to append clean letters/digits to
    cleanedString := []rune{}

    // iterate through rune slice
    for _, char := range sToRuneArray {
        if(unicode.IsLetter(char) || unicode.IsDigit(char)) {
            cleanedString = append(cleanedString, char)
        }
    }

    // declare pointers
    a_pointer := 0
    b_pointer := len(cleanedString) - 1

    // iterate through cleaned string and verify runes are same
    for a_pointer <= b_pointer {
        if cleanedString[a_pointer] != cleanedString[b_pointer] {
            return false
        }

        a_pointer++
        b_pointer--
    }

    return true
}
