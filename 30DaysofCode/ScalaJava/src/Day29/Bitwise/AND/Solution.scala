package Day29.Bitwise.AND

object Solution {
  def main(args: Array[String]) {
    val t = io.StdIn.readInt
    for (_ <- 1 to t) {
      val nk = io.StdIn.readLine.split(" ").map(x => x.toInt)
      val n = nk(0)
      val k = nk(1)
      var Max = -10000
      for (i <- 1 to n - 1) {
        for (j <- i + 1 to n) {
          val v = i & j
          if (v > Max && v < k) {
            Max = v
          }
        }
      }
      println(Max)
      // write your code here
    }
  }
}
