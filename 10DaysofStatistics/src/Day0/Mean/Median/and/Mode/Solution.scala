package Day0.Mean.Median.and.Mode

object Solution {

  def main(args: Array[String]) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution
*/
    val n = scala.io.StdIn.readInt()
    val arr = scala.io.StdIn.readLine().split(" ").map(_.toInt)
    printf("%.1f\n", arr.sum.toDouble / n.toDouble)
    val sortedArr = arr.sorted
    printf("%.1f\n", (sortedArr(n / 2) + sortedArr(n / 2 - 1)).toDouble / 2.0)
    val mapData = sortedArr.groupBy(f => f).map(v => (v._1, v._2.length)).toList.sortBy(f => f._2)
    val Max = mapData.last._2
    println(mapData.filter(p => p._2 == Max).sortBy(f => f._1).head._1)
  }
}