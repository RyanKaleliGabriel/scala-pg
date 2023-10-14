//In the imperative style we write one imperative command at a time, 
//iterate with loops, and often mutate state 
//shared between different functions.
//
object loopExample {
  def main(args: Array[String]) = {
    var i = 0
    var sum = 0
    while(i<args.length) {
      println(args(i))
      sum =  sum + Integer.parseInt(args(i))
      i+=1
    }
    println(sum)
  }
}
