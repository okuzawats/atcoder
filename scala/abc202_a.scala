object Main extends App {
  println(21 - io.StdIn.readLine().split(' ').map(_.toInt).sum)
}