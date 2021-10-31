package abc_044

fun main (args: Array<String>) {
  val w = readLine()!!
  println(if (w.toCharArray().groupBy { it }.all { it.value.size % 2 == 0 }) "Yes" else "No")
}