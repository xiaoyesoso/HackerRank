package Heaps.Find.the.Running.Median

import scala.collection.mutable.PriorityQueue

object Solution {

  def main(args: Array[String]) {
    val sc = new java.util.Scanner(System.in);
    var n = sc.nextInt();
    var high = PriorityQueue[Double]()(Ordering.by { x => 0 - x })
    var low = PriorityQueue[Double]()
    for (a_i <- 0 to n - 1) {
      val v = sc.nextDouble()
      if (low.isEmpty) low.enqueue(v)
      else {
        if (low.size > high.size) {
          if (low.head < v) high.enqueue(v)
          else {
            high.enqueue(low.dequeue())
            low.enqueue(v)
          }
        } else {
          if (v <= high.head) low.enqueue(v)
          else {
            low.enqueue(high.dequeue())
            high.enqueue(v)
          }
        }
      }
      /*
      print("low is ")
      var it = low.iterator
      while(it.hasNext) print(it.next() + " ")
      println()
      print("high is ")
      it = high.iterator
      while(it.hasNext) print(it.next() + " ")
      println()*/
      printf("%.1f\n", if ((low.size + high.size) % 2 == 0) (low.head + high.head) / 2.0 else low.head)
    }
  }
}
