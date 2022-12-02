object fibo_recur{
  def main(args: Array[String]): Unit = {
  
    for( a <- 1 until 7){
         System.out.print(fibo(a)+",");
      }
  }

  def fibo(n:Long):Long = n match {
        case 0 => 0
        case 1 => 1
        case 2 => 1
        case _ => fibo(n-1) + fibo(n-2) + fibo(n-3)
      }
}