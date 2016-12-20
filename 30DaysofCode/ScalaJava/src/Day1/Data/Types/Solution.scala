package Day1.Data.Types

object Solution {
    def main(args: Array[String]) {
        val i = 4
        val d = 4.0
        val s = "HackerRank "
        // Read values of another integer, double, and string variables
        // Note use scala.io.StdIn to read from stdin
        val v1 = scala.io.StdIn.readLine().toInt
        val v2 = scala.io.StdIn.readLine().toDouble
        val v3 = scala.io.StdIn.readLine() 
        // Print the sum of both the integer variables
        println(i+v1)
        // Print the sum of both the double variables
        println(d+v2)
        // Concatenate and print the string variables
        println(s+v3)
        // The 's' variable above should be printed first.
    }
}