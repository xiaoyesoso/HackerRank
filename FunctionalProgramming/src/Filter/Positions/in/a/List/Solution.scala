package Filter.Positions.in.a.List

object Solution {
  def f(arr: List[Int]): List[Int] = arr.zipWithIndex.filter(_._2 % 2 == 1).map(_._1)
}