package abc_162

fun main (args: Array<String>) {
  val n = readLine()!!.toLong()
  println((1..n).filter { it % 3L != 0L && it % 5L != 0L }.sum())
}