package Beautiful.Days.at.the.Movies

import scala.collection.mutable.ArrayBuffer

object Solution {

  def main(args: Array[String]) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution
*/
    val Array(i, j, n) = scala.io.StdIn.readLine().split(" ").map(_.toInt)
    var arr = new ArrayBuffer[Int]
    for (x <- i to j) arr += x
    println(arr.map { x => if (math.abs(x - x.toString().reverse.toInt) % n == 0) true else false }.count { x => x })
  }
}