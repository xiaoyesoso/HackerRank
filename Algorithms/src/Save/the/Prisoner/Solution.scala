package Save.the.Prisoner

object Solution {

  def main(args: Array[String]) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution
*/
    val t = scala.io.StdIn.readInt()
    for (i <- 1 to t) {
      val Array(n, m, s) = scala.io.StdIn.readLine().split(" ").map(_.toInt)
      val re = (m + s - 1) % n
      println(if (re == 0) n else re)
    }
  }
}