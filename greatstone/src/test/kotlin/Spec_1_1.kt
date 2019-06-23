
import io.kotlintest.data.suspend.forall
import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec
import io.kotlintest.tables.row

class Spec_1_1 : StringSpec({

    "isUniqueChars 는 중복 문자 없는 문자열을 입력하면 true 를 리턴해야 한다." {
        forall(
            row("abcde"),
            row("zxcvafd"),
            row("ZXCVBG"),
            row("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ")
        ) {
            it.isUniqueChars() shouldBe true
        }
    }

    "isUniqueChars 는 중복 문자 있는 문자열을 입력하면 false 를 리턴해야 한다." {
        forall(
            row("aabcde"),
            row("hahahah"),
            row("OKKKKKK")
        ) {
            it.isUniqueChars() shouldBe false
        }
    }
})