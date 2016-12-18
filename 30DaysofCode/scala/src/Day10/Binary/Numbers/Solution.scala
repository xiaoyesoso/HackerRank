package Day10.Binary.Numbers

object Solution {

  def main(args: Array[String]) {
    val sc = new java.util.Scanner(System.in);
    var n = sc.nextInt();
    var maxNum = -1
    var tmpNum = 0
    while (n != 0) {
      if (n % 2 == 1) {
        tmpNum = tmpNum + 1
      } else if (tmpNum > maxNum) {
        maxNum = tmpNum
        tmpNum = 0
      } else {
        tmpNum = 0
      }
      n = n / 2
    }
    if (tmpNum > maxNum) {
      maxNum = tmpNum
    }
    println(maxNum)
  }
}