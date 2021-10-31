object Main extends App {
  val Array(v, t, s, d) = io.StdIn.readLine().split(' ').map(_.toInt)
  println(if (d < t * v || s * v < d) "Yes" else "No")
}