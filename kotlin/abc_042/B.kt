package abc_042

import java.util.*

fun main (args: Array<String>) {
  val scanner = Scanner(System.`in`)
  val n = scanner.nextInt()
  scanner.nextInt()

  val strings = mutableListOf<String>()
  repeat(n) {
    strings.add(scanner.next())
  }
  strings.sort()
  println(strings.joinToString(""))
}