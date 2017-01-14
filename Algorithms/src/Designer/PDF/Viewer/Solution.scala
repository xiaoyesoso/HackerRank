package Designer.PDF.Viewer

object Solution {

  def main(args: Array[String]) {
    val high = scala.io.StdIn.readLine().split(" ").map(_.toInt)
    val line = scala.io.StdIn.readLine()
    var Max = 0
    for (i <- 0 to line.length() - 1) {
      val x = high(line.charAt(i) - 'a')
      if (x > Max) Max = x
    }
    println(Max * line.length())
  }
}
