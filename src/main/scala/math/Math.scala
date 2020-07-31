package math

import scala.Function.tupled
import scala.annotation.tailrec
import scala.math.pow

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

  val fibCache: LazyList[BigInt] = BigInt(0) #:: BigInt(1) #:: (fibCache zip fibCache.tail).map(tupled(_ + _))

  def fibonacci2(n: Int): BigInt = fibCache.drop(n).head

  // fibonacci3
  val root5 = pow(5, 0.5)
  val phi = (1 + root5) / 2.0

  def fibonacci3(n: Int): Long = ((pow(phi, n) - pow(-phi, -n)) / root5).toLong

  @tailrec def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)

  def gcd(list: Int*): Int = {
    @tailrec def findGcd(res: Int, seq: Seq[Int]): Int =
      seq match {
        case Nil => res
        case x +: xs => findGcd(gcd(res, x), xs)
      }

    findGcd(list.head, list.tail)
  }

  def avg(seq: Double*): Double = seq.foldLeft((0.0, 1)) { case ((avg, n), el) => (avg + (el - avg) / n, n + 1) }._1

}