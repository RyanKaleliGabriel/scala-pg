
//A closure is a function, whose return value depends on the value of one or more variables declared  outside this function.

object closures{
  def main(args: Array[String]){
    println("multiplier(1) value = " + multiplier(1))
    println("multiplier(2) value = " + multiplier(2))
  }
  var factor = 3
  var multiplier = (i: Int)=> i*factor
}
