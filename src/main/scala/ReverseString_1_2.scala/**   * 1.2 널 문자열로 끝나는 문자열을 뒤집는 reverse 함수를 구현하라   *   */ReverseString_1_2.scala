/**
  * 1.2 널 문자열로 끝나는 문자열을 뒤집는 reverse 함수를 구현하라
  *
  */
object ReverseString_1_2 {
  def reverse(str: String): String = {
    val isEndWithSpace = str.endsWith(" ")
    if (isEndWithSpace) {
      val trimStr = str.trim
      (for (i <- trimStr.length - 1 to 0 by -1) yield trimStr(i)).mkString
    } else {
      str
    }
  }

  def main(args: Array[String]): Unit = {
    println(reverse("hello world "))
    println(reverse("hello word"))
    println(reverse("good night "))
  }
}
