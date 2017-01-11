package Mini.Max.Sum

object Solution {

  def main(args: Array[String]) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution
*/ val arr = scala.io.StdIn.readLine().split(" ").map(_.toLong)
    val Sum = arr.sum
    print((Sum - arr.max) + " " + (Sum - arr.min))
  }
}