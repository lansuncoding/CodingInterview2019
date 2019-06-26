/**
  * 1.2 널 문자열로 끝나는 문자열을 뒤집는 reverse 함수를 구현하라
  *
  */
object ReverseString_1_2 {
  def reverse(str: String): String = {
    val strArr = str.toCharArray
    val full: Int = strArr.length
    val half: Int = full / 2

    var char: Char = '\u0000'
    for (i <- 0 to half - 1) {
      char = strArr(i)
      strArr(i) = strArr(full - i - 1)
      strArr(full - i - 1) = char
    }
    strArr.mkString("")
  }

  def main(args: Array[String]): Unit = {
    println(reverse("hello world")) // dlrow olleh
    println(reverse("good"))        // doog
    println(reverse("dlrow olleh")) // hello world
  }
}
