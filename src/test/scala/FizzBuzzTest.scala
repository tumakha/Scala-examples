import org.scalatest.FunSuite

/**
  * @author Yuriy Tumakha
  */
class FizzBuzzTest extends FunSuite {

  test("FizzBuzz1") {
    assert(FizzBuzz1.say(1) === "1")
    assert(FizzBuzz1.say(3) === "Fizz")
    assert(FizzBuzz1.say(5) === "Buzz")
    assert(FizzBuzz1.say(15) === "FizzBuzz")
  }

  test("FizzBuzz2") {
    FizzBuzz2.main(Array.empty)
    assert(FizzBuzz2.say(1) === "1")
    assert(FizzBuzz2.say(3) === "Fizz")
    assert(FizzBuzz2.say(5) === "Buzz")
    assert(FizzBuzz2.say(15) === "FizzBuzz")
  }

}
