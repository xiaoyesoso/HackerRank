package Apple.and.Orange

object Solution {

  def main(args: Array[String]) {
    val sc = new java.util.Scanner(System.in);
    var s = sc.nextInt();
    var t = sc.nextInt();
    var a = sc.nextInt();
    var b = sc.nextInt();
    var m = sc.nextInt();
    var n = sc.nextInt();
    var appleSum = 0
    var orangeSum = 0
    var apple = new Array[Int](m);
    for (apple_i <- 0 to m - 1) {
      apple(apple_i) = sc.nextInt();
      val index = a + apple(apple_i)
      if (index >= s && index <= t) appleSum += 1
    }
    var orange = new Array[Int](n);
    for (orange_i <- 0 to n - 1) {
      orange(orange_i) = sc.nextInt();
      val index = b + orange(orange_i)
      if (index >= s && index <= t) orangeSum += 1

    }
    println(appleSum)
    println(orangeSum)
  }
}
