package abc_043

fun main (args: Array<String>) {
  readLine()!!
  val a = readLine()!!.split(' ').map(String::toInt)
  println((a.min()!!..a.max()!!).map { i -> a.map { (it - i) * (it - i) }.sum() }.min())
}