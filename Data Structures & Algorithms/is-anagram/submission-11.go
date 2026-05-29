func isAnagram(s string, t string) bool {
    if len(s) != len(t) {
        return false
    } 
    
    // keep the char to int ratio in a map
    letterMap := make(map[rune]int)

    // iterate through s
    for _, char := range s {
        letterMap[char] = letterMap[char] + 1 
    }

    // iterate through t
    for _, char := range t {
        letterMap[char] = letterMap[char] - 1
    }

    // iterate through map and check for 0s in value
    for _, value := range letterMap {
        if value != 0 {
            return false
        }
    }
    return true
}
