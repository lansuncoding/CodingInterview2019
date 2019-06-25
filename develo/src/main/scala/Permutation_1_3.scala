/**
  * 1.3 문자열 두 개를 입력받아 그 중 하나가 다른 하나의 순열인지 판별하는 메소드를 만들어라
  */
object Permutation_1_3 {

  def isPermutation(str1: String, str2: String): Boolean = {
    if (str1.length != str2.length) {
      return false
    }
    val repeatStr = str1 * 2
    if (repeatStr.contains(str2)) {
      return true
    }
    false
  }

  def main(args: Array[String]): Unit = {
    println(isPermutation("abc", "bca"))
    println(isPermutation("abc", "cba") )
    println(isPermutation("abc", "cab"))
  }
}
