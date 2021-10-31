object Main extends App {
  val Array(a, b, c) = io.StdIn.readLine().split(' ').map(_.toInt)
  println(if (a * a + b * b < c * c) "Yes" else "No")
}