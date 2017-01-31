/**
  * @author Yuriy Tumakha
  */
object FizzBuzz extends App {

  def say(number: Int): String = {
    val sb = new StringBuilder
    if (number % 3 == 0) sb ++= "Fizz"
    if (number % 5 == 0) sb ++= "Buzz"
    if (sb.isEmpty) sb ++= number.toString
    sb.toString
  }

  println((1 to 20).map(say).toList.mkString(", "))

}
