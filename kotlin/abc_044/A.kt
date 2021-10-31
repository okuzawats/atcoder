package abc_044

import java.util.Scanner

fun main (args: Array<String>) {
  val scn = Scanner(System.`in`)
  val n = scn.nextInt()
  val k = scn.nextInt()
  val x = scn.nextInt()
  val y = scn.nextInt()
  println((1..n).map { if (it <= k) x else y }.sum())
}