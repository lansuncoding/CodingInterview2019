package main

import (
	"math/big"
	"strings"
	"unicode"
)

func removeDuplicateCharacters(s string) string {
	result := strings.Builder{}
	status := big.NewInt(0)
	runes := []rune(s)
	for i := 0; i < len(runes); i++ {
		bit := int(runes[i])
		if status.Bit(bit) == 0 || unicode.IsSpace(runes[i]) {
			status.SetBit(status, bit, 1)
			result.WriteRune(runes[i])
		}
	}
	return result.String()
}

func main() {
	println(removeDuplicateCharacters("abcde")) // abcde
	println(removeDuplicateCharacters("abcdeAbcde")) // abcdeA
	println(removeDuplicateCharacters("abcdeABCDe")) // abcdeABCD
	println(removeDuplicateCharacters("hello world")) // helo wrd
	println(removeDuplicateCharacters("hello world 토마토 맛있어")) // helo wrd 토마 맛있어
}
