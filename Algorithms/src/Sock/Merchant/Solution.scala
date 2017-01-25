package Sock.Merchant

import scala.collection.immutable.HashMap

object Solution {

  def main(args: Array[String]) {
    val sc = new java.util.Scanner(System.in);
    var n = sc.nextInt();
    var myMap: Map[Int, Int] = new HashMap()
    for (c_i <- 0 to n - 1) {
      val v = sc.nextInt();
      if (myMap.contains(v)) myMap = myMap.updated(v, myMap.get(v).get + 1)
      else myMap = myMap.+((v, 1))
    }
    var cnt = 0
    for (kv <- myMap) {
      cnt += kv._2 / 2
    }
    println(cnt)
  }
}
