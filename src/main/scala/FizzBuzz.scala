/**
  * @author Yuriy Tumakha
  */
object FizzBuzz1 extends App {

  def say(number: Int): String = {
    val sb = new StringBuilder
    if (number % 3 == 0) sb ++= "Fizz"
    if (number % 5 == 0) sb ++= "Buzz"
    if (sb.isEmpty) sb ++= number.toString
    sb.toString
  }

  println((1 to 20).map(say).toList)

}

object FizzBuzz2 extends App {

  val dict = Map(3 -> "Fizz", 5 -> "Buzz")

  def say(number: Int): String = {
    val sb = new StringBuilder
    for {
      (key, value) <- dict
      if number % key == 0
    } sb ++= value

    if (sb.isEmpty) sb ++= number.toString
    sb.toString
  }

  def fizzBuzz(n: Int): List[String] = (1 to n).map(say).toList

  println(fizzBuzz(20))

}
