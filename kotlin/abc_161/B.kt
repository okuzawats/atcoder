package abc_161

fun main (args: Array<String>) {
  val (n, m) = readLine()!!.split(' ').map(String::toInt)
  val a = readLine()!!.split(' ').map(String::toInt)
  val b = a.sum().toDouble() / (4 * m).toDouble()
  println(if (a.filter { it.toDouble() >= b }.count() >= m) "Yes" else "No")
}