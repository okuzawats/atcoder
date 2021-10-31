package abc_047

fun main (args: Array<String>) {
  val (a, b, c) = readLine()!!.split(' ').map(String::toInt)
  println(if (a + b == c || b + c == a || c + a == b) "Yes" else "No")
}