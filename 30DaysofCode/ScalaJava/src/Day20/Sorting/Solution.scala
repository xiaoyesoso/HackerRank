package Day20.Sorting


object Solution {

  def main(args: Array[String]) {
    val sc = new java.util.Scanner(System.in);
    var n = sc.nextInt();
    var a = new Array[Int](n);
    for (a_i <- 0 to n - 1) {
      a(a_i) = sc.nextInt();
    }

    var numSwaps = 0
    if (n > 1) {
      var i = 1
      var complete = false
      while (i <= n - 1 && !complete) {
        var sorted = true
        var loc = 0
        while (loc < n - i && sorted) {
          if (a(loc) > a(loc + 1)) {
            sorted = false
          }
          loc = loc + 1
        }
        if (sorted) complete = true
        else {
          while (loc < n && !sorted) {
            if (a(loc - 1) > a(loc)) {
              val tmp = a(loc)
              a(loc) = a(loc - 1)
              a(loc - 1) = tmp
              numSwaps = numSwaps + 1
            }
            loc = loc + 1
          }
        }
      }
    }
    println("Array is sorted in " + numSwaps + " swaps.")
    println("First Element: " + a(0))
    println("Last Element: " + a(n - 1))
  }
}