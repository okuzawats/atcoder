package abc_163

fun main (args: Array<String>) {
  val (n, m) = readLine()!!.split(' ').map(String::toInt)
  val a = readLine()!!.split(' ').map(String::toInt)
  val ans = n - a.sum()
  println(if (ans >= 0) ans else -1)
}