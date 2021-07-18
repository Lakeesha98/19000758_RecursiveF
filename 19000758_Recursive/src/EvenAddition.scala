object EvenAddition extends App {
    def additionEven (n:Int): Int={
      if(n%2==0){
        if(n==0) 0
        else n+additionEven(n-1)
      }
      else additionEven(n-1)
    }
  print("Enter your number : ")
  var n=scala.io.StdIn.readInt()
  println(additionEven(n))
}
