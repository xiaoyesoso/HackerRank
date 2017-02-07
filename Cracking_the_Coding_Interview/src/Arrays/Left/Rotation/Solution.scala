package Arrays.Left.Rotation

object Solution {

  def main(args: Array[String]) {
    val sc = new java.util.Scanner(System.in);
    var n = sc.nextInt();
    var k = sc.nextInt();
    var a = new Array[Int](n);
    for (a_i <- 0 to n - 1) {
      a(a_i) = sc.nextInt();
    }
    k = k % n
    var first = true
    for (i <- k to n - 1) {
      if (first) {
        first = false
        print(a(i))
      } else print(" " + a(i))
    }
    for (i <- 0 to k - 1) print(" " + a(i))
  }
}
