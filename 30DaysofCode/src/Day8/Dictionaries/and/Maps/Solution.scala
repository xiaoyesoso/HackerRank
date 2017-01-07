package Day8.Dictionaries.and.Maps

object Solution {

  def main(args: Array[String]) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution
*/
    val n = scala.io.StdIn.readLine().toInt
    var myMap: Map[String, String] = Map()
    for (i <- 1 to n) {
      val kv = scala.io.StdIn.readLine().split(" ")
      myMap = myMap ++ Map(kv(0) -> kv(1))
    }
    for (i <- 1 to n) {
      val keys = scala.io.StdIn.readLine().split(" ") //测试数据里面 有些行输入了多个key
      for (key <- keys) {
        if (myMap.contains(key)) {
          println(key + "=" + myMap.get(key).get)
        } else {
          println("Not found")
        }
      }
    }
  }
}