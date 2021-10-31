package abc_043

import java.util.Scanner

fun main (args: Array<String>) {
  val s = Scanner(System.`in`).next()
  var a = ""
  s.forEach { c ->
    if (c == 'B') {
      if (a.length > 0) {
        a = a.substring(0, a.length - 1)
      }
    }
    else a += c
  }
  println(a)
}