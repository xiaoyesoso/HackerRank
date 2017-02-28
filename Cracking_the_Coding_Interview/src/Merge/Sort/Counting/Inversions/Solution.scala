package Merge.Sort.Counting.Inversions

object Solution {

  def main(args: Array[String]) {
    val sc = new java.util.Scanner(System.in);
    var t = sc.nextInt();
    var a0 = 0;

    while (a0 < t) {
      var n = sc.nextInt();
      var arr = new Array[Int](n);
      var tmp = new Array[Int](n);
      for (arr_i <- 0 to n - 1) {
        arr(arr_i) = sc.nextInt();
      }
      // 注意 cnt 要为 
      var cnt:Long = 0
      def Merge(first: Int, mid: Int, last: Int): Unit = {
        var i = first
        var j = mid + 1
        var cur = 0
        while (i <= mid && j <= last) {
          if (arr(i) <= arr(j)) {
            tmp(cur) = arr(i)
            cur += 1
            i += 1
          } else {
            tmp(cur) = arr(j)
            // 可知在arr的[i,mid]上的值都比 arr[j] 大
            cnt += mid - i + 1
            cur += 1
            j += 1
          }
        }
        while (i <= mid) {
          tmp(cur) = arr(i)
          cur += 1
          i += 1
        }
        while (j <= last) {
          tmp(cur) = arr(j)
          cur += 1
          j += 1
        }
        for (index <- 0 to cur - 1) arr(first + index) = tmp(index)
      }

      def MergeSort(first: Int, last: Int): Unit = {
        if (first != last) {
          val mid = (first + last) / 2
          MergeSort(first, mid)
          MergeSort(mid + 1, last)
          Merge(first, mid, last)
        }
      }
      MergeSort(0, n - 1)
      println(cnt)
      a0 += 1;
    }
  }
}
