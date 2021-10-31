package abc_217

fun main () {
  val n = readLine()!!.toInt()
  val p = readLine()!!.split(' ').map(String::toInt)
  val q = IntArray(n)
  p.forEachIndexed { i, v -> q[v - 1] = i + 1 }
  print(q.joinToString(" "))
}