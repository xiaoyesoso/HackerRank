package Bit.Manipulation.Lonely.Integer

object Solution {

    def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in);
        var n = sc.nextInt()
        var v = sc.nextInt()
        for(a_i <- 0 to n-2) {
           v ^= sc.nextInt()
        }
        println(v)
    }
}
