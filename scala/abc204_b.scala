object Main extends App {
  io.StdIn.readLine()
  println(io.StdIn.readLine().split(' ').map(_.toInt).map { n => math.max(n - 10, 0) }.sum)
}