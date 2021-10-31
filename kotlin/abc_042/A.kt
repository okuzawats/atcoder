package abc_042

fun main (args: Array<String>) {
  val inputs = readLine()!!.split(" ").map(String::toInt).toMutableList().apply { sort() }
  println(if (inputs == listOf(5, 5, 7)) "YES" else "NO")
}