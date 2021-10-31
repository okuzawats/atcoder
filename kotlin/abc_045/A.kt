package abc_045

fun main (args: Array<String>) {
  val (a, b, h) = (1..3).map { readLine()!!.toInt() }
  println((a + b) * h / 2)
}