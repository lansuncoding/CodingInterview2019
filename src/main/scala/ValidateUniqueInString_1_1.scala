/**
  * 1.1 문자열에 포함된 문자들이 전부 유일한지 검사하는 알고리즘을 구현하여라 다른 자료구조를 사용할 수 없다.
  * ASCII Code
  */
object ValidateUniqueInString_1_1 {
  def check(chars: String): Boolean = {
    if (chars.length > 256) return false

    var checker = 0
    chars.foreach { char =>
      val value = char.toChar - 'a'.toChar
      val shift = 1 << value

      if ((checker & shift) > 0) {
        return false
      }
      // bitwise inclusive OR and assignment operator
      checker |= shift
    }
    return true
  }

  def main(args: Array[String]): Unit = {
    println(check("aabccccc".toLowerCase))
    println(check("fgc".toLowerCase))
    println(check("ccc".toLowerCase))
    println(check("abca".toLowerCase))
  }
}
