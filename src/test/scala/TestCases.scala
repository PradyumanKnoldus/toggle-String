import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class TestCases extends AnyFlatSpec with Matchers {
  "changeCase" should "convert all uppercase letters to lowercase" in {
    ChangeCase.changeCase("HELLO") shouldBe "hello"
  }

  it should "convert all lowercase letters to uppercase" in {
    ChangeCase.changeCase("scala") shouldBe "SCALA"
  }

  it should "not modify non-letter characters" in {
    ChangeCase.changeCase("123") shouldBe "123"
  }

  it should "handle empty strings correctly" in {
    ChangeCase.changeCase("") shouldBe ""
  }

  it should "handle strings with non-ASCII characters" in {
    ChangeCase.changeCase("HÉLLÖ") shouldBe "héllö"
  }
}
