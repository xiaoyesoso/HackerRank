package Between.Two.Sets

object Solution {

  def main(args: Array[String]) {
    val sc = new java.util.Scanner(System.in);
    var n = sc.nextInt();
    var m = sc.nextInt();
    var a = new Array[Int](n);
    var Max = 1
    for (a_i <- 0 to n - 1) {
      a(a_i) = sc.nextInt();
      if (a(a_i) % Max == 0) Max = a(a_i)
      else if (Max % a(a_i) != 0) {
        var vx = Max
        var vy = a(a_i)
        while (vy > 0) {
          val tmp = vy
          vy = vx % vy
          vx = tmp
        }
        Max = Max * a(a_i) / vx
      }
    }
    var b = new Array[Int](m);
    for (b_i <- 0 to m - 1) {
      b(b_i) = sc.nextInt();
    }
    val Min = b.reduce { (x, y) =>
      var vx = x
      var vy = y
      while (vy > 0) {
        val tmp = vy
        vy = vx % vy
        vx = tmp
      }
      vx
    }
    var count = 0
    var bg = Max
    while (bg <= Min) {
      if (Min % bg == 0)
        count += 1
      bg += Max
    }
    print(count)
  }
}
