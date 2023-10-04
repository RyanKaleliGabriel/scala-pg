/* The syntax is simply that each argument is preceded 
 * by a parameter name and an equals sign.*/
object namedArguments{
  def main(args: Array[String]){
    printInt(b=5, a=7);
  }

  def printInt
  (a:Int,b:Int) = {
    println("Value of a : "+a);
    println("Value of b : "+b);
  }
}

