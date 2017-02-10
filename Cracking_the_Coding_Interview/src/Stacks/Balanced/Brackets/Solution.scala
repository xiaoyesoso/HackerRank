package Stacks.Balanced.Brackets

import scala.collection.mutable.Stack

object Solution {

  def main(args: Array[String]) {
    val sc = new java.util.Scanner(System.in);
    var t = sc.nextInt();
    var a0 = 0;
    def Re(c: Char) = if (c == ']') '[' else if (c == ')') '(' else if (c == '}') '{'

    while (a0 < t) {
      var expression = sc.next();
      var s = Stack[Char]()
      var i = 0
      var is = true
      while (i < expression.length() && is) {
        val c = expression(i)
        if (c == '[' || c == '(' || c == '{') s = s.push(c)
        else {
          if (s.size == 0 || s.pop() != Re(c)) is = false
        }
        i += 1
      }
      if (is && s.size == 0) println("YES") else println("NO")
      a0 += 1;
    }
  }
}
