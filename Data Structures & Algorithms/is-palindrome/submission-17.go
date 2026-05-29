func isPalindrome(s string) bool {
    // make all letters same case
    s = strings.ToLower(s)

    // split string into array of runes
    s = strings.ReplaceAll(s, " ", "")

    // cleanse string of non characters

    //fmt.Println(sToRuneArray)

    sToRuneArray := []rune(s)

    cleaned_slice := []rune{}

    for _, char := range sToRuneArray {
        if(unicode.IsLetter(char) || unicode.IsDigit(char)) {
            cleaned_slice = append(cleaned_slice, char)
        }
    }

    a_pointer := 0;
    b_pointer := len(cleaned_slice) - 1

    for a_pointer < b_pointer {
        if cleaned_slice[a_pointer] != cleaned_slice[b_pointer] {
            return false;
        }
        a_pointer++
        b_pointer--
    }

    return true

}
