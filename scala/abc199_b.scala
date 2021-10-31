object Main extends App {
  val n = io.StdIn.readLine()
  val min = io.StdIn.readLine().split(' ').map(_.toInt).max
  val max = io.StdIn.readLine().split(' ').map(_.toInt).min
  println(math.max(max - min + 1, 0))
}