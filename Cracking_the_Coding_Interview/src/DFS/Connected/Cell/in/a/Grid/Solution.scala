package DFS.Connected.Cell.in.a.Grid

object Solution {

  def main(args: Array[String]) {
    val sc = new java.util.Scanner(System.in);
    var n = sc.nextInt();
    var m = sc.nextInt();
    var grid = Array.ofDim[Int](n, m);
    var visted = Array.ofDim[Boolean](n, m)
    for (grid_i <- 0 to n - 1) {
      for (grid_j <- 0 to m - 1) {
        grid(grid_i)(grid_j) = sc.nextInt();
        visted(grid_i)(grid_j) = false
      }
    }
    var cnt = 0
    var MaxCnt = 0
    def dfs(i: Int, j: Int) {
      cnt += 1
      visted(i)(j) = true
      if (i - 1 >= 0 && !visted(i - 1)(j) && grid(i - 1)(j) == 1) dfs(i - 1, j)
      if (j - 1 >= 0 && !visted(i)(j - 1) && grid(i)(j - 1) == 1) dfs(i, j - 1)
      if (i + 1 < n && !visted(i + 1)(j) && grid(i + 1)(j) == 1) dfs(i + 1, j)
      if (j + 1 < m && !visted(i)(j + 1) && grid(i)(j + 1) == 1) dfs(i, j + 1)
      if (i + 1 < n && j - 1 >= 0 && !visted(i + 1)(j - 1) && grid(i + 1)(j - 1) == 1) dfs(i + 1, j - 1)
      if (i + 1 < n && j + 1 < m && !visted(i + 1)(j + 1) && grid(i + 1)(j + 1) == 1) dfs(i + 1, j + 1)
      if (i - 1 >= 0 && j - 1 >= 0 && !visted(i - 1)(j - 1) && grid(i - 1)(j - 1) == 1) dfs(i - 1, j - 1)
      if (i - 1 >= 0 && j + 1 < m && !visted(i - 1)(j + 1) && grid(i - 1)(j + 1) == 1) dfs(i - 1, j + 1)

    }
    for (i <- 0 to n - 1) {
      for (j <- 0 to m - 1) {
        if (!visted(i)(j) && grid(i)(j) == 1) {
          dfs(i, j)
          if (MaxCnt < cnt) MaxCnt = cnt
          cnt = 0
        }
      }
    }
    println(MaxCnt)
  }
}
