package Time.Conversion

object Solution {

  def main(args: Array[String]) {
    val time = scala.io.StdIn.readLine()
    val res = time.substring(0, time.length() - 2)
    if (time.charAt(time.length() - 2) == 'A') {
      if (res.substring(0, 2).toInt == 12)
        println("00" + res.substring(2))
      else
        println(res)
    } else {
      if (res.substring(0, 2).toInt == 12)
        println(res)
      else {
        val h = res.substring(0, 2).toInt + 12
        println(h + res.substring(2))
      }
    }

  }
}
