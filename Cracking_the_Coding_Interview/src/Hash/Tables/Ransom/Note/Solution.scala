package Hash.Tables.Ransom.Note

object Solution {

  def main(args: Array[String]) {
    val sc = new java.util.Scanner(System.in);
    var m = sc.nextInt();
    var n = sc.nextInt();
    var magazine = Map[String, Int]()
    for (magazine_i <- 0 to m - 1) {
      val key = sc.next()
      if (magazine.contains(key)) magazine = magazine.updated(key, magazine(key) + 1)
      else magazine = magazine.+((key, 1))
    }
    var is = true
    var i = 0
    while (i < n && is) {
      val key = sc.next()
      if (!magazine.contains(key) || magazine(key) == 0) {
        is = false
      } else {
        magazine = magazine.updated(key, magazine(key) - 1)
      }
      i += 1
    }
    if (is) println("Yes") else println("No")
  }
}
