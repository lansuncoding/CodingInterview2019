// 1.1 Implement an algorithm to determine if a string has all unique characters.
// What if you can not use additional data structures?
fun String.isUniqueChars(): Boolean {
//    return (this.length == this.toCharArray().distinct().size)
    var checker = 0L
    for (c in this) {
        val value = c - 'A'
        val shift = 1L shl value
        if ((checker and shift) > 0) {
            return false
        }
        checker = checker or shift
    }
    return true
}