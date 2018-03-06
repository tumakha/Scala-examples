package math

import scala.annotation.tailrec

/**
  * @author Yuriy Tumakha
  */
package object Math {

  def factorial(n: Int): BigInt = (1 to n).map(BigInt(_)).product

  @tailrec def fibonacci(n: Int, prev: BigInt = 0, curr: BigInt = 1): BigInt =
    n match {
      case 0 => prev
      case _ => fibonacci(n - 1, curr, prev + curr)
    }

  def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)

}