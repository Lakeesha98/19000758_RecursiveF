import scala.util.control.Breaks.break

object FibonacciSeq extends App {
  def fibonacci(n:Int):Int=n match{
    case n if(n<=1) => n
    case _ => fibonacci(n-1)+fibonacci(n-2)
  }
  def fibonacciSeqP(n:Int,i:Int): Unit ={
    if(n==i) break
    else
      println(fibonacci(i))
    fibonacciSeqP(n,i+1)
  }

  print("Enter a number : ")
  var n=scala.io.StdIn.readInt()
  print(fibonacciSeqP(n,0))


}
