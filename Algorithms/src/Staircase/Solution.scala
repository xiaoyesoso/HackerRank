package Staircase

object Solution {

  def main(args: Array[String]) {
    val sc = new java.util.Scanner(System.in);
    var n = sc.nextInt();
    for (i <- 0 to n - 1) {
      for (j <- 0 to n - 1) {
        if (j < n - 1 - i) print(" ")
        else print("#")
      }
      println()
    }
  }
}
