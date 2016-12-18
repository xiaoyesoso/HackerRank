package Day9.Recursion

object Solution {

  def factorial(num: Int): Int = {  //必须要把函数 命名成 factorial 
    if (num == 1) return 1 else return num * factorial(num - 1)
  }

  def main(args: Array[String]) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution
*/ println(factorial(scala.io.StdIn.readLine().toInt))

  }
}