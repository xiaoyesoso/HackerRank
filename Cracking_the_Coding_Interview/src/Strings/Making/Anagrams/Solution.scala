package Strings.Making.Anagrams

object Solution {
  def main(args: Array[String]) {
    val sc = new java.util.Scanner(System.in);
    var a = sc.next();
    var b = sc.next();
    var m = Map[Char, Int]()
    for (c <- a) {
      if (m.contains(c)) m = m.updated(c, m(c) + 1)
      else m = m + ((c, 1))
    }
    for (c <- b) {
      if (m.contains(c)) m = m.updated(c, m(c) - 1)
      else m = m + ((c, -1))
    }
    println(m.map(f => math.abs(f._2)).sum)
  }
}
