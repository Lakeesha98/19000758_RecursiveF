object Prime extends App{
  def isPrime(p:Int,n:Int=2):Boolean=n match{
    case x if(p <= n) => true
    case x if(p%n ==0) =>false
    case x  => isPrime(p,n+1)
  }
  println(isPrime(5))
  println(isPrime(1))

}
