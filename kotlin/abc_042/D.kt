package abc_042

// could not solved
//fun main (args: Array<String>) {
//  val (h, w, a, b) = readLine()!!.split(' ').map(String::toInt)
//  println((0..(h - a)).map { s(it, b) * s(h - it, w - b) }.count() % 1_000_000_007)
//}

tailrec fun f(n: Int, a: Int = 1): Int = if (n < 1) a else f(n - 1, n * a)

fun s(a: Int, b: Int): Int = f(a + b) / f(a) / f(b)