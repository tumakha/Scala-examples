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

  def fibonacci2(n: Int): BigInt = {
    def fibStream(prev: BigInt = 0, curr: BigInt = 1): Stream[BigInt] = prev #:: fibStream(curr, prev + curr)

    fibStream().drop(n).head
  }

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