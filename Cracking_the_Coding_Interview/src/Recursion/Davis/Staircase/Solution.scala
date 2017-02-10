package Recursion.Davis.Staircase

import scala.collection.mutable.Map

object Solution {
  def main(args: Array[String]) {
    val sc = new java.util.Scanner(System.in);
    val s = sc.nextInt();
    var myMap = Map[Int, Int]()
    def climb(num: Int): Int = {
      if (num == 1) 1
      else if (num == 2) 2
      else if (num == 3) 4
      else {
        var v1 = 0
        var v2 = 0
        var v3 = 0
        if (myMap.contains(num - 1)) v1 = myMap(num - 1)
        else {
          v1 = climb(num - 1)
          myMap = myMap.+=((num - 1, v1))
        }

        if (myMap.contains(num - 2)) v2 = myMap(num - 2)
        else {
          v2 = climb(num - 2)
          myMap = myMap.+=((num - 2, v2))
        }

        if (myMap.contains(num - 3)) v3 = myMap(num - 3)
        else {
          v3 = climb(num - 3)
          myMap = myMap.+=((num - 3, v3))
        }
        v1 + v2 + v3
      }
    }
    for (a0 <- 1 to s) {
      println(climb(sc.nextInt()))
    }
  }
}
