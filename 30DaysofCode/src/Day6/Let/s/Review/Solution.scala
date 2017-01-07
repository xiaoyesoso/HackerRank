package Day6.Let.s.Review



object Solution {

    def main(args: Array[String]) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution
*/       val n = scala.io.StdIn.readLine().toInt
         for(num <- 1 to n){
           val str = scala.io.StdIn.readLine()
           var str1 = ""
           var str2 = ""
           var is = true
           for(loc <- 0 to str.length() -1){
             if(is){
               is = false
               str1 = str1 + str.charAt(loc)
             }else{
               is = true
               str2 = str2 + str.charAt(loc)
             }
           }
           println(str1 + " " + str2)
         }
    }
}