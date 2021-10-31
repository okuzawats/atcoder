object Main extends App {
  val Array(a, b, c) = io.StdIn.readLine().split(' ').map(_.toInt).sorted
  println(if (a + c == 2 * b) "Yes" else "No")
}