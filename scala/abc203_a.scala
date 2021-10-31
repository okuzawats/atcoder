object Main extends App {
  val Array(x, y, z) = io.StdIn.readLine().split(' ').map(_.toInt)
  println(if (x == y) z else if (y == z) x else if (z == x) y else 0)
}