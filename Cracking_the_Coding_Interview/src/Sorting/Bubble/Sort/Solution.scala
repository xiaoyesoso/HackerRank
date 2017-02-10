package Sorting.Bubble.Sort

object Solution {

  def main(args: Array[String]) {
    val sc = new java.util.Scanner(System.in);
    var n = sc.nextInt();
    var a = new Array[Int](n);
    for (a_i <- 0 to n - 1) {
      a(a_i) = sc.nextInt();
    }
    var Sorted = false
    var i = -1
    var num = 0
    while (!Sorted) {
      i += 1
      Sorted = true
      for (j <- 0 to n - 2 - i) {
        if (a(j) > a(j + 1)) {
          Sorted = false
          num += 1
          val tmp = a(j)
          a(j) = a(j + 1)
          a(j + 1) = tmp
        }
      }
    }
    println("Array is sorted in " + num + " swaps.")
    println("First Element: " + a(0))
    println("Last Element: " + a(n - 1))
  }
}