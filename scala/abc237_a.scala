object Main extends App {
  val n = scala.io.StdIn.readLong()
  println(if (n < 2147483648L && n >= -2147483648L) "Yes" else "No")
}