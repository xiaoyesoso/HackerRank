package Evaluating.ex

object Solution {
  def f(x: Double): Double = if (x == 1.0 || x == 0.0) 1 else x * f(x - 1.0)
  def main(args: Array[String]) {
    val sc = new java.util.Scanner(System.in);
    var n = sc.nextInt();
    var a0 = 0;
    while (a0 < n) {
      var x = sc.nextDouble();
      var sum = 0.0
      for (i <- 0 to 9) {
        sum += math.pow(x, i.toDouble) / f(i.toDouble)
      }
      println(f"$sum%.5f")
      a0 += 1;
    }
  }
}