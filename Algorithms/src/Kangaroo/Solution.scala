package Kangaroo

object Solution {

  def main(args: Array[String]) {
    val sc = new java.util.Scanner(System.in);
    var x1 = sc.nextInt();
    var v1 = sc.nextInt();
    var x2 = sc.nextInt();
    var v2 = sc.nextInt();
    if ((x1 > x2 && v1 >= v2) || (x1 < x2 && v1 <= v2)) println("NO")
    else if (x1 == x2) println("YES")
    else {
      var fx = 0
      var fv = 0
      var lx = 0
      var lv = 0
      if (x1 > x2) {
        fx = x1
        fv = v1
        lx = x2
        lv = v2
      } else {
        fx = x2
        fv = v2
        lx = x1
        lv = v1
      }
      while (fx > lx) {
        fx = fx + fv
        lx = lx + lv
      }
      if (fx < lx) println("NO")
      else println("YES")
    }
  }
}
