object Main extends App {
  val in = new java.util.Scanner(System.in)
  println(
    List.fill(in.nextInt())((in.next(), in.nextLong()))
      .sortBy(_._2).reverse.tail.head._1
  )
}