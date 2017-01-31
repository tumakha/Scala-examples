import FizzBuzz.say
import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

/**
  * @author Yuriy Tumakha
  */
@RunWith(classOf[JUnitRunner])
class FizzBuzzTest extends FunSuite {

  test("say") {
    assert(say(1) === "1")
    assert(say(3) === "Fizz")
    assert(say(5) === "Buzz")
    assert(say(15) === "FizzBuzz")
  }

}
