package Bon.Appétit

object Solution {

  def main(args: Array[String]) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution
*/
    val Array(nums, index) = scala.io.StdIn.readLine().split(" ").map(_.toInt)
    val costs = scala.io.StdIn.readLine().split(" ").map(_.toInt).zipWithIndex.filter(p => p._2 != index).map(_._1).sum / 2
    val charged = scala.io.StdIn.readInt()
    println(if (costs == charged) "Bon Appetit" else charged - costs)
  }
}