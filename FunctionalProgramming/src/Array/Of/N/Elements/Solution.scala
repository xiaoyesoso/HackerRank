package Array.Of.N.Elements

import scala.collection.immutable.List


object Solution extends App {
  def f(num: Int): List [Int] = { 
    val list = if(num == 0) List() else num::f(num-1)
    return list
  }
  println(f(readInt))
}