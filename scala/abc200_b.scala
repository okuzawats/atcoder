object Main extends App {
  val Array(n, k) = io.StdIn.readLine().split(' ').map(_.toInt)
  println((1 to k).foldLeft(n.toLong)((a, _) => if (a % 200 == 0) a / 200 else a * 1000 + 200))
}