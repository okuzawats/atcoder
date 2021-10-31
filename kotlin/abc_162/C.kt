package abc_162

fun main (args: Array<String>) {
  val k = readLine()!!.toInt()

  var ans = 0
  for (a in 1..k) {
    for (b in 1..k) {
      val ab = gcd(a, b)
      for (c in 1..k) {
        ans += gcd(ab, c)
      }
    }
  }
  println(ans)
}

tailrec fun gcd(p: Int, q: Int): Int {
  if (p % q == 0) return q
  return gcd(q, p % q)
}