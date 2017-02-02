package Angry.Professor

object Solution {

  def main(args: Array[String]) {
    val sc = new java.util.Scanner(System.in);
    var t = sc.nextInt();
    var a0 = 0;
    while (a0 < t) {
      var n = sc.nextInt();
      var k = sc.nextInt();
      var a = new Array[Int](n);
      for (a_i <- 0 to n - 1) {
        a(a_i) = sc.nextInt();
      }
      if (a.filter { x => x <= 0 }.size < k) println("YES") else println("NO")
      a0 += 1;
    }
  }
}
