package main

import "unicode"

func getBit(r rune) int {
	if unicode.IsLower(r) {
		return int(r) - 'a' + 26
	}
	return 'A'
}

func alphabetIndexes(s string, diff int, status []int) {
	r := []rune(s)
	for i := 0; i < len(r); i++ {
		bit := getBit(r[i])
		status[bit] += diff
	}
}

func isAnagram(s1, s2 string) bool {
	if len(s1) != len(s2) {
		return false
	}
	
	status := make([]int, 100)
	alphabetIndexes(s1, 1, status)
	alphabetIndexes(s2, -1, status)
	for i := 0; i < len(status); i++ {
		if status[i] != 0 {
			return false
		}
	}
	return true
}

func main() {
	println(isAnagram("abcd", "dcba")) // true
	println(isAnagram("aba", "bba")) // false
	println(isAnagram("powop", "PoWoP")) // false
	println(isAnagram("poAoq", "POaOQ")) // false
	println(isAnagram("hello", "world")) // false
	println(isAnagram("hei1o", "hello")) // false
	println(isAnagram("hello", "hello")) // true
	println(isAnagram("aaa", "aa")) // false
	println(isAnagram("aaa", "aaa")) // true
	println(isAnagram("123", "123")) // true
}