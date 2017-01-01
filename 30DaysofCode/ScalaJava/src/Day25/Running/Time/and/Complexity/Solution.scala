package Day25.Running.Time.and.Complexity

object Solution {
  def main(agrs: Array[String]) {
    val num = scala.io.StdIn.readInt()
    for (i <- 1 to num) {
      val n = scala.io.StdIn.readInt()
      if (n == 1) println("Not prime") else {
        val m = math.sqrt(n.toDouble).toInt
        var b = false
        var loc = 2
        while (!b && loc <= m) {
          if (n % loc == 0) {
            b = true
          }
          loc += 1
        }
        if (b) println("Not prime")
        else println("Prime")
      }
    }
  }
}