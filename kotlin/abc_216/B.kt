package abc_216

fun main () {
  val n = readLine()!!.toInt()
  val set = HashSet<String>()
  print(if ((1..n).all { set.add(readLine()!!) }) "No" else "Yes")
}