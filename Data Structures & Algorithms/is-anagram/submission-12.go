func isAnagram(s string, t string) bool {
    // edge case
    if len(s) != len(t) {
        return false;
    }
    
    // make a map of rune to int
    letterCounter := make(map[rune]int)

    // iterate through s
    for _, char := range s {
        letterCounter[char] = letterCounter[char] + 1
    }

    // iterate through t
    for _, char := range t {
        letterCounter[char] = letterCounter[char] - 1
    }

    // iterate through map and check for 0s in value
    for _, value := range letterCounter {
        if value != 0 {
            return false;
        }
    }

    return true

}
