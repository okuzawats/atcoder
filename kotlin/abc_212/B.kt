package abc_212

fun main () {
  val x = readLine()!!.map { it - '0' }
  print(if (x.distinct().size == 1 || x.mapIndexed { i, v -> (v - i + 10) % 10 }.distinct().size == 1) "Weak" else "Strong")
}