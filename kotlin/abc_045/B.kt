package abc_045

fun main (args: Array<String>) {
  val s = (0..2).map {readLine()!!.map {it - 'a'}.toMutableList() }
  var t = 0
  while (s[t].isNotEmpty()) {
    t = s[t].removeAt(0)
  }
  println('A' + t)
}