object Main extends App {
  println(io.StdIn.readLine().reverse.map {
    case '6' => '9'
    case '9' => '6'
    case c => c
  })
}