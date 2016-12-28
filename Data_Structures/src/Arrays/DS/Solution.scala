package Arrays.DS

object Solution {

  def main(args: Array[String]) {
    val sc = new java.util.Scanner(System.in);
    var n = sc.nextInt();
    var arr = new Array[Int](n);
    for (arr_i <- 0 to n - 1) {
      arr(arr_i) = sc.nextInt();
    }
    for (arr_i <- 1 to n) {
      if (arr_i == 1) print(arr(n - 1))
      else print(" " + arr(n - arr_i))
    }
  }
}
