package Day7.Arrays

object Solution {

  def main(args: Array[String]) {
    val sc = new java.util.Scanner(System.in);
    var n = sc.nextInt();
    var arr = new Array[Int](n);
    for (arr_i <- 0 to n - 1) {
      arr(arr_i) = sc.nextInt();
    }
    val rearr = arr.reverse
    for (loc <- 0 to n - 1) {
      if (loc == 0) print(rearr(loc)) else print(" " + rearr(loc))
    }
    println()
  }
}
