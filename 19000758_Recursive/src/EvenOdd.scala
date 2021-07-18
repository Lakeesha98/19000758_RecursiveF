object EvenOdd extends App {
    def isEvenOdd(n:Int)=n%2 match{
      case 0 => "Even Number"
      case _ => "Odd Number "
    }
   print("Enter your number : ")
  var n=scala.io.StdIn.readInt()
  println(isEvenOdd(n))
}
