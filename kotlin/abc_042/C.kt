package abc_042

fun main (args: Array<String>) {
  val (n, k) = readLine()!!.split(' ').map(String::toInt)
  val d = readLine()!!.split(' ').map(String::single)
  println((n..100000).first { it.toString().all { c -> !d.contains(c) } })
}