package Jumping.on.the.Clouds.Revisited

object Solution {

  def main(args: Array[String]) {
    val sc = new java.util.Scanner(System.in);
    var n = sc.nextInt()
    var k = sc.nextInt()
    var c = new Array[Int](n);
    for (c_i <- 0 to n - 1) {
      val tmp = sc.nextInt()
      c(c_i) = if (tmp == 0) -1 else -3
    }
    var index = k % n
    var E = 100
    while (index != 0 && E > 0) {
      E += c(index)
      index = (index + k) % n
    }
    E += c(0)
    println(if (E < 0) 0 else E)
  }
}
