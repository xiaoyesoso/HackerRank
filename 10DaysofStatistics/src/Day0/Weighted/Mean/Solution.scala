package Day0.Weighted.Mean

object Solution {
  def main(args: Array[String]){
     val n = scala.io.StdIn.readInt()
     val xs = scala.io.StdIn.readLine().split(" ").map(_.toInt)
     val ws = scala.io.StdIn.readLine().split(" ").map(_.toInt)
     var xwsum = 0
     var wsum = 0
     for(i <- 0 to n-1) {
       xwsum += xs(i)*ws(i)
       wsum += ws(i)
     }
     printf("%.1f\n",xwsum.toDouble/wsum.toDouble)
  }
}