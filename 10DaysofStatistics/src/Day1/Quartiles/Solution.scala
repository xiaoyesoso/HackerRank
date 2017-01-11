package Day1.Quartiles

object Solution {

  def main(args: Array[String]) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution
*/ val n = scala.io.StdIn.readInt()
    val arrs = scala.io.StdIn.readLine().split(" ").map(_.toInt).sorted
    val p1 = n / 2 / 2
    val p2 = n / 2
    val p3 = n -1 - n / 2 / 2
    var v1 = arrs(p1)
    var v2 = arrs(p2)
    var v3 = arrs(p3)
    if (n % 2 == 0)
      v2 = (arrs(p2) + arrs(p2 - 1)) / 2

    if (n / 2 % 2 == 0) {
      v1 = (arrs(p1) + arrs(p1 - 1)) / 2
      v3 = (arrs(p3) + arrs(p3 + 1)) / 2
    }

    println(v1)
    println(v2)
    println(v3)
  }
}