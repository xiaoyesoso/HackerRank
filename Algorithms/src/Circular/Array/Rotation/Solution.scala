package Circular.Array.Rotation

object Solution {

  def main(args: Array[String]) {
    val sc = new java.util.Scanner(System.in);
    var n = sc.nextInt();
    var k = sc.nextInt();
    k = k % n
    var q = sc.nextInt();
    var a = new Array[Int](n);
    for (a_i <- 0 to n - 1) {
      a(a_i) = sc.nextInt();
    }
    var b = new Array[Int](n);
    var index = 0
    for (i <- n - k to n - 1) {
      b(index) = a(i)
      index += 1
    }
    var aindex = 0
    while (index < n) {
      b(index) = a(aindex)
      aindex += 1
      index += 1
    }
    var a0 = 0;
    while (a0 < q) {
      var m = sc.nextInt();
      println(b(m))
      a0 += 1;
    }
  }
}
