object Main extends App {
  val in = new java.util.Scanner(System.in)
  val n, s, d = in.nextInt
  println(if (List.fill(n)((in.nextInt(), in.nextInt())).exists(p => {p._1 < s && p._2 > d})) "Yes" else "No")
}