package Tries.Contacts

import scala.collection.mutable.ArrayBuffer
import scala.collection.mutable.Map

object Solution {

  def main(args: Array[String]) {
    val sc = new java.util.Scanner(System.in);
    var n = sc.nextInt();
    var arr = ArrayBuffer[String]()
    var a0 = 0;
    var myMap = Map[String, Int]()
    while (a0 < n) {
      var op = sc.next()
      var contact = sc.next()
      if (op == "add") {
        var str = ""
        for (cc <- contact) {
          str += cc
          if (myMap.contains(str)) myMap.update(str, myMap(str) + 1)
          else myMap = myMap.+=((str, 1))
        }
      } else println(if (myMap.contains(contact)) myMap(contact) else 0)
      a0 += 1
    }
  }
}
