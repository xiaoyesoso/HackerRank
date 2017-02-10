package Queues.A.Tale.of.Two.Stacks

import scala.collection.mutable.Queue

object Solution {

  def main(args: Array[String]) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution
*/
    var q = Queue[Int]()
    val n = scala.io.StdIn.readInt()
    for (i <- 1 to n) {
      val arr = scala.io.StdIn.readLine().split(" ").map(_.toInt)
      if (arr(0) == 1) q.enqueue(arr(1))
      else if (arr(0) == 2) q.dequeue()
      else println(q.front)
    }
  }
}