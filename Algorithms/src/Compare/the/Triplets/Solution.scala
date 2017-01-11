package Compare.the.Triplets

object Solution {

    def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in);
        var a0 = sc.nextInt();
        var a1 = sc.nextInt();
        var a2 = sc.nextInt();
        var b0 = sc.nextInt();
        var b1 = sc.nextInt();
        var b2 = sc.nextInt();
        var sumA = 0
        var sumB = 0
        if(a0 > b0) sumA += 1 else if(a0 < b0) sumB +=1
        if(a1 > b1) sumA += 1 else if(a1 < b1) sumB +=1
        if(a2 > b2) sumA += 1 else if(a2 < b2) sumB +=1
        println(sumA + " "+sumB)
    }
}
