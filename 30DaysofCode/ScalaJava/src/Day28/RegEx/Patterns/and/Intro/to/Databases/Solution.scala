package Day28.RegEx.Patterns.and.Intro.to.Databases


object Solution {

    def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in);
        var N = sc.nextInt();
        var a0 = 0;
        var names = List[String]()
        val pattern = ".+@gmail\\.com$".r
        while(a0 < N){
            var firstName = sc.next();
            var emailID = sc.next();
            a0 += 1;
            if( pattern.findAllMatchIn(emailID).length > 0){
              names = firstName+:names
            }
        }
        names = names.sorted
        for(name <- names) println(name)
    }
}
