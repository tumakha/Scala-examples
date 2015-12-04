package math

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.FunSuite
import Math._

/**
  * @author Yuriy Tumakha
  */
@RunWith(classOf[JUnitRunner])
class MathTest extends FunSuite {

  test("factorial") {
    assert(factorial(1) === 1)
    assert(factorial(2) === 2)
    assert(factorial(5) === 120)
    assert(factorial(20) === 2432902008176640000L)
    assert(factorial(30) === BigInt("265252859812191058636308480000000"))
    assert(factorial(50) === BigInt("30414093201713378043612608166064768844377641568960512000000000000"))
  }

  test("gcd") {
    assert(gcd(1, 1) === 1)
    assert(gcd(3, 1) === 1)
    assert(gcd(5, 15) === 5)
    assert(gcd(19, 7) === 1)
    assert(gcd(652, 156) === 4)
    assert(gcd(237, 3791) === 1)
    assert(gcd(4029, 64447) === 17)
  }

}