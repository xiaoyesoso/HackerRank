package Utopian.Tree

import scala.collection.Map

object Solution {

  def main(args: Array[String]) {
    val sc = new java.util.Scanner(System.in);
    var t = sc.nextInt();
    var a0 = 0;
    var myMap: Map[Int, Int] = Map()
    var h = 0
    for (i <- 0 to 60) {
      if (i % 2 == 0) h += 1
      else h *= 2
      myMap = myMap.+((i, h))
    }
    while (a0 < t) {
      var n = sc.nextInt();
      println(myMap(n))
      a0 += 1;
    }
  }
}
