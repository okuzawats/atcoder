package abc_046

fun main (args: Array<String>) {
  val (n, k) = readLine()!!.split(' ').map(String::toInt)
  println((2..n).fold(k) { acc, i -> acc * (k - 1) })
}