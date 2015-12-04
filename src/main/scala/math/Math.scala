package math

/**
  * @author Yuriy Tumakha
  */
package object Math {

  def factorial(n: Int): BigInt = (1 to n).map(BigInt(_)).reduceLeft(_*_)

  def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)

}