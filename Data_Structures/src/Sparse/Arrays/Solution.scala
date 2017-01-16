package Sparse.Arrays

import scala.collection.mutable.ArrayBuffer

object Solution {

  def main(args: Array[String]) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution
*/
    val N = scala.io.StdIn.readInt()
    var myBuffer = new ArrayBuffer[String]
    for (i <- 1 to N) {
      myBuffer.+=:(scala.io.StdIn.readLine())
    }
    val Q = scala.io.StdIn.readInt()
    for (i <- 1 to Q) {
      val str = scala.io.StdIn.readLine()
      println(myBuffer.filter(x => x.equals(str)).length)
    }
  }
}