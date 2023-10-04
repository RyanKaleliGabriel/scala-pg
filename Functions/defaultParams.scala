/* The argument for such a parameter can optionally
 * be omitted from a function call, in which case the 
   corresponding argument will be filled in with the default. 
   If you specify one of the parameters, then first argument 
   will be passed using that parameter and 
   second will be taken from default value*/
object defaultParams{
  def main(args: Array[String]){
    println("Returned value : "+addInt());
  }
  def addInt( a:Int = 5, b:Int = 7) : Int = {
    var sum:Int = 0
    sum = a+b
    sum
  }
}

