package Dynamic.Array

import scala.collection.mutable.ArrayBuffer

object Solution {
  def main(args: Array[String]) {

    val Array(strn, strq) = scala.io.StdIn.readLine().split(" ")
    val n = strn.toInt
    val q = strq.toInt
    var last = 0
    var arrs = new Array[ArrayBuffer[Int]](n)
    for (i <- 0 to n - 1) arrs(i) = new ArrayBuffer[Int]()
    for (i <- 1 to q) {
      val Array(stra, strb, strc) = scala.io.StdIn.readLine().split(" ")
      val a = stra.toInt
      val b = strb.toInt
      val c = strc.toInt
      if (a == 1) {
        val loc = (b ^ last) % n
        arrs(loc) += c
      } else {
        val arr = arrs((b ^ last) % n)
        last = arr.apply(c % arr.length)
        println(last)
      }
    }
  }
}