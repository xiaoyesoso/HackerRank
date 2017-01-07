package Day2.Operators

object Solution {
  def main(args:Array[String]){
    val meal = scala.io.StdIn.readLine().toDouble
    val tip = scala.io.StdIn.readLine().toDouble
    val rax = scala.io.StdIn.readLine().toDouble
    print("The total meal cost is "+math.round(meal*(100+tip+rax)/100.0)+" dollars.")
  }
}