package Viral.Advertising

object Solution {

  def main(args: Array[String]) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution
*/
    val N = scala.io.StdIn.readInt()
    var num = 5
    var sum = 0
    for (i <- 1 to N) {
      val n: Int = num / 2
      sum += n
      num = n * 3
    }
    println(sum)
  }
}