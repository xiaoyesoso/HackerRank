package Time.Complexity.Primality

object Solution {

  def main(args: Array[String]) {
    val sc = new java.util.Scanner(System.in);
    val p = sc.nextInt();
    def isprime(num: Int): Boolean = {
    if (num == 1) false
    else {
      var is = true
      var i = 2
      val Max = Math.sqrt(num.toDouble).toInt
      while (i <= Max && is) {
        if (num % i == 0) is = false
        i += 1
      }
      is
    }
  }
    for (a0 <- 1 to p) {
      if(isprime(sc.nextInt())) println("Prime") 
      else println("Not prime") 
    }
  }
}
