package Left.Rotation

object Solution {

  def main(args: Array[String]) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution
*/ val Array(n, d) = Console.readLine().split(" ").map(x => x.toInt)
    val myArray = Console.readLine().split(" ").map(x => x.toInt)
    val d2 = d % n
    if (d2 == 0) {
      for (i <- 0 to n - 1) {
        if (i == 0) print(myArray(i))
        else print(" " + myArray(i))
      }
    } else {
      for (i <- d2 to n - 1) {
        if (i == d2) print(myArray(i))
        else print(" " + myArray(i))
      }
      for (i <- 0 to d2 - 1) {
         print(" " + myArray(i))
      }
    }
  }
}