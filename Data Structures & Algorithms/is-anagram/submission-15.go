func isAnagram(s string, t string) bool {
    if len(s) != len(t) {
        return false
    }

    letterCounter := make(map[rune]int)

    for _, char := range(s) {
        letterCounter[char] = letterCounter[char] + 1
    }

    for _, char := range(t) {
        letterCounter[char] = letterCounter[char] - 1
    }

    for _, val := range(letterCounter) {
        if val != 0 {
            return false
        }
    } 

    return true
}
