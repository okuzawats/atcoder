package abc_161

fun main (args: Array<String>) {
  val (n, k) = readLine()!!.split(' ').map(String::toLong)
  println(diff(n, k))
}

tailrec fun diff(n: Long, k: Long): Long {
  val a = if ((n - k) >= 0) n - k else k - n
  if (a > n) return n
  return diff(a, k)
}