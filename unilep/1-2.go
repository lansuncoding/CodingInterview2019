package main

func reverseString(s []rune) string {
	full := len(s)
	half := full / 2
	for i := 0; i < half; i++ {
		r := s[i]
		s[i] = s[full - i - 1]
		s[full - i - 1] = r
	}
	return string(s)
}

func main() {
	println(reverseString([]rune("abcde")))
	println(reverseString([]rune("hello world")))
	println(reverseString([]rune("dlrow olleh")))
	println(reverseString([]rune("unilep")))
}
