package Find.Digits

object Solution {

  def main(args: Array[String]) {
    val sc = new java.util.Scanner(System.in);
    var t = sc.nextInt();
    var a0 = 0;
    while (a0 < t) {
      var n = sc.nextInt();
      var tmpn = n
      var cnt = 0
      while (tmpn > 0) {
        val cn = tmpn % 10
        if (cn != 0 && n % cn == 0) cnt += 1
        tmpn /= 10
      }
      println(cnt)
      a0 += 1;
    }
  }
}
