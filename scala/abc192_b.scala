object Main extends App {
  val s = io.StdIn.readLine()
  println(if ((0 until s.length()).forall(i => { if (i % 2 == 0) s(i).isLower else s(i).isUpper })) "Yes" else "No")
}