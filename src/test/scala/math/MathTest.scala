package math

import org.scalatest.FunSuite
import Math._

/**
  * @author Yuriy Tumakha
  */
class MathTest extends FunSuite {

  test("factorial") {
    assert(factorial(1) === 1)
    assert(factorial(2) === 2)
    assert(factorial(5) === 120)
    assert(factorial(20) === 2432902008176640000L)
    assert(factorial(30) === BigInt("265252859812191058636308480000000"))
    assert(factorial(45) === BigInt("119622220865480194561963161495657715064383733760000000000"))
  }

  test("fibonacci") {
    assert(fibonacci(0) === 0)
    assert(fibonacci(1) === 1)
    assert(fibonacci(2) === 1)
    assert(fibonacci(3) === 2)
    assert(fibonacci(4) === 3)
    assert(fibonacci(5) === 5)
    assert(fibonacci(55) === 139583862445L)
    assert(fibonacci(100) === BigInt("354224848179261915075"))
  }

  test("fibonacci2") {
    assert(fibonacci2(0) === 0)
    assert(fibonacci2(1) === 1)
    assert(fibonacci2(2) === 1)
    assert(fibonacci2(3) === 2)
    assert(fibonacci2(4) === 3)
    assert(fibonacci2(5) === 5)
    assert(fibonacci2(6) === 8)
    assert(fibonacci2(55) === 139583862445L)
    assert(fibonacci2(100) === BigInt("354224848179261915075"))
  }

  test("fibonacci3") {
    //assert(fibonacci3(0) === 0)
    assert(fibonacci3(1) === 1)
    assert(fibonacci3(2) === 1)
    assert(fibonacci3(3) === 2)
    assert(fibonacci3(4) === 3)
    assert(fibonacci3(5) === 5)
    assert(fibonacci3(6) === 8)
    assert(fibonacci3(55) === 139583862445L)
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

  test("gcd of multiple numbers") {
    assert(gcd(4, 16, 256, 36) === 4)
    assert(gcd(4, 8, 22) === 2)
    assert(gcd(5, 25) === 5)
    assert(gcd(7) === 7)
  }

  test("gcd of empty list") {
    intercept[java.util.NoSuchElementException] {
      gcd()
    }
  }

  test("avg") {
    assert(avg(1) === 1)
    assert(avg(1, 2, 3) === 2)
    assert(avg(2, 3) === 2.5)
    assert(avg(-11119999999999L, 11119999999999.444) === 0.22265625)
    assert(avg() === 0.0)
  }

}