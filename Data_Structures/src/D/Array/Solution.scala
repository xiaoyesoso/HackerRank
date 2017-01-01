package D.Array

object Solution {

  def main(args: Array[String]) {
    val sc = new java.util.Scanner(System.in);
    var arr = Array.ofDim[Int](6, 6);
    for (arr_i <- 0 to 6 - 1) {
      for (arr_j <- 0 to 6 - 1) {
        arr(arr_i)(arr_j) = sc.nextInt();
      }
    }
    var sumArr = Array.ofDim[Int](7, 7);
    for (arr_i <- 0 to 5) {
      for (arr_j <- 0 to 6) {
        if (arr_j == 0) sumArr(arr_i)(arr_j) = 0
        else sumArr(arr_i)(arr_j) = sumArr(arr_i)(arr_j - 1) + arr(arr_i)(arr_j - 1)
      }
    }

    var Max = -100
    for (row <- 0 to 3) {
      for (col <- 0 to 3) {
        var tem = 0
        tem = sumArr(row)(col + 3) - sumArr(row)(col) + sumArr(row + 2)(col + 3) - sumArr(row + 2)(col) + arr(row + 1)(col + 1)
        if (tem > Max) Max = tem
      }
    }

    println(Max)
  }
}
