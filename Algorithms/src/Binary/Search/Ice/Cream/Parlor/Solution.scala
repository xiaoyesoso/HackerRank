package Binary.Search.Ice.Cream.Parlor

import scala.collection.mutable.HashMap
import scala.collection.mutable.ArrayBuffer

object Solution {

  def main(args: Array[String]) {
    val sc = new java.util.Scanner(System.in);
    var t = sc.nextInt();
    var a0 = 0;
    while (a0 < t) {
      var m = sc.nextInt();
      var n = sc.nextInt();
      var myMap = HashMap[Int, ArrayBuffer[Int]]()
      var find = false
      var a_i = 1
      while (a_i <= n) {
        val key2 = sc.nextInt()
        val key1 = m - key2
        if (myMap.contains(key1) && !find) {
          if (key1 != key2) {
            println(myMap(key1)(0) + " " + a_i)
            find = true
          } else if (myMap(key1).size == 1) {
            println(myMap(key1)(0) + " " + a_i)
            find = true
          }

        }
        if (!find) {
          if (myMap.contains(key2))
            myMap.update(key2, myMap(key2).+=(a_i))
          else myMap.+=((key2, new ArrayBuffer[Int]().+=(a_i)))
        }
        a_i += 1
      }
      a0 += 1;
    }
  }
}
