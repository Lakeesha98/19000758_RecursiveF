object Addition extends App {
  def sum(n:Int):Int={
    if(n==1) 1
    else n+sum(n-1)
  }
  print("Enter your number : ")
  var n=scala.io.StdIn.readInt()
  println((sum(n)))
}
