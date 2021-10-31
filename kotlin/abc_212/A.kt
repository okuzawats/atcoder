package abc_212

fun main () {
  val (a, b) = readLine()!!.split(' ').map(String::toInt)
  print(if (a == 0) "Silver" else if (b == 0) "Gold" else "Alloy")
}