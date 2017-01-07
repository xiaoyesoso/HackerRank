package Day26.Nested.Logic

object Solution {

  def main(args: Array[String]) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution
*/
    val Array(d1, m1, y1) = scala.io.StdIn.readLine().split(" ").map(_.toInt)
    val Array(d2, m2, y2) = scala.io.StdIn.readLine().split(" ").map(_.toInt)
    print(if (y1 > y2) 10000
    else if (y1 == y2 && m1 > m2) 500 * (m1 - m2)
    else if (y1 == y2 && m1 == m2 && d1 > d2) 15 * (d1 - d2)
    else 0)

  }
}