package BFS.Shortest.Reach.in.a.Graph

import scala.collection.mutable.ArrayBuffer
import scala.collection.mutable.Queue
import scala.collection.mutable.Map

object Solution {

  def main(args: Array[String]) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution
*/
    val q = scala.io.StdIn.readInt()
    for (i <- 1 to q) {
      val Array(n, m) = scala.io.StdIn.readLine().split(" ").map(_.toInt)
      var graph = Map[Int, ArrayBuffer[Int]]()
      var visit = new Array[Boolean](n + 1)
      var dis = new Array[Int](n + 1)
      for (j <- 0 to n) {
        visit(j) = false
        dis(j) = -1
      }
      for (j <- 1 to m) {
        val Array(a, b) = scala.io.StdIn.readLine().split(" ").map(_.toInt)
        graph(a) = graph.getOrElse(a, new ArrayBuffer[Int]()).+=(b)
        graph(b) = graph.getOrElse(b, new ArrayBuffer[Int]()).+=(a)
      }
      val bg = scala.io.StdIn.readInt()
      var que = Queue[Int]()
      que.enqueue(bg)
      visit(bg) = true
      while (que.size != 0) {
        val v = que.dequeue()
        if (graph.contains(v)) {
          val d = if (dis(v) == -1) 6 else dis(v) + 6
          val arr = graph(v)
          for (x <- arr if !visit(x)) {
            dis(x) = d
            que.enqueue(x)
            visit(x) = true
          }
        }
      }
      var fir = true
      for (i <- 1 to n if i != bg) {
        if (fir) {
          print(dis(i))
          fir = false
        } else print(" " + dis(i))
      }
      println()
    }
  }
}