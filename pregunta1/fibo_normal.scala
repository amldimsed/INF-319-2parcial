object fibo_normal{
  def main(args: Array[String]): Unit = {
  
    for( a <- 1 until 7){
         System.out.print(fibo2(a)+"-*/*-");
      }
  }

  def fibo2(n:Long):Long = {
      var a=0
      var b=1
      var contador=0
     
      while(contador<n) {
        val c=a+b
        a=b
        b=c
        contador=contador+1
      }
      return a
      }
}