package Hello.World.N.Times

object Solution {
  def f(n: Int) = 1 to n foreach { _ => println("Hello World") }
}