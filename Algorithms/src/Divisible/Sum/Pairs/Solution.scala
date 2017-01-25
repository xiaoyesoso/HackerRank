package Divisible.Sum.Pairs

object Solution {

  def main(args: Array[String]) {
    val sc = new java.util.Scanner(System.in);
    var n = sc.nextInt();
    var k = sc.nextInt();
    var a = new Array[Int](n);
    var MAX = -1
    var myList = List[Int]()
    var cnt = 0
    for (a_i <- 0 to n - 1) {
      a(a_i) = sc.nextInt();
      var b = k - a(a_i)
      while (b <= MAX) {
        cnt += myList.count(x => x == b)
        b += k
      }
      if (a(a_i) > MAX) MAX = a(a_i)
      myList = myList.::(a(a_i))
    }
    println(cnt)
  }
}
