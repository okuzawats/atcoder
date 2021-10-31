object Main extends App {
  val Array(x, y) = io.StdIn.readLine().split(' ').map(_.toInt)
  println(if (x == y) x else s"${3 - x - y}")
}