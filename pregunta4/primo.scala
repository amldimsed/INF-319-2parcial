import scala.collection.mutable.ListBuffer
import java.util.Scanner

object primo{
  def main(args: Array[String]): Unit = {
        System.out.print("-------------------------------- \n");
        var ads = new ListBuffer[Int]()
        val scanner=new java.util.Scanner(System.in)
        var n = scanner.nextLine()
        var contador=1
        var prim=2
        var d=2
        
        while (contador<=n.toInt) {
            if (prim%d==0) {
                if(prim==d){
                    ads.append(prim)
                    contador=contador+1
                }
                    d=2
                    prim=prim+1
            }
            else {
                d=d+1
            }
        }
        System.out.print("--------------------------------\n");
        System.out.print(ads.toList);
        
      }
}