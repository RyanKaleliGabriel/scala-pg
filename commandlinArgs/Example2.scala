
object Example2{
  def main(args: Array[String]) = {
    var i = 0
    while(i<args.length) {
      println("Hello, "+args(i)+ "!")
      i+=1
    }
  }
}

