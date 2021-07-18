import scala.io.StdIn.readInt
import scala.util.control.Breaks.break


object PrimeSeq extends App {

  def isPrime(p:Int,n:Int=2):Boolean=n match{
    case n if(p <= n) => true
    case n if(p%n ==0) => false
    case n  => isPrime(p,n+1)
  }
  def printSeq(p:Int){
    var i=0
    for( i <- 2 to p ){
      if(isPrime(i,2)){
        println(i)
      }
    }


  }

  print("Enter a number : ")
  var p=scala.io.StdIn.readInt()
  printSeq(p)

}
