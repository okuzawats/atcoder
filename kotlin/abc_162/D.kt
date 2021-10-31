package abc_162

// R: 17, G: 6, B: 1

fun main (args: Array<String>) {
  readLine()!!.toInt()
  val s = readLine()!!.map {it - 'A'}

  var ans = 0
  for (a in 0 until s.size - 2) {
    for (b in a until s.size - 1) {
      for (c in b until s.size) {
        if (s[a] != s[b] && s[b] != s[c] && s[c] != s[a]) {
          if (b - a != c - b) {
            ans++
          }
        }
      }
    }
  }
  println(ans)
}