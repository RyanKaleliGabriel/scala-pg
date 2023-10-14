// Implicit classes allow addtion of methods to existing classes without modifying
// their source code
// Implicit classes are defined in the object scope
object ImplicitsExample {
  implicit class IntExtensions(value: Int) {
    def squared(): Int = value * value
  }
}

object implicitex {
  import ImplicitsExample._
  def main(args: Array[String]) = {
    val num = 5
    val squaredNum = num.squared()
    //You can now call squared() on an Int
    println(s"The square of $num is $squaredNum")
  }
}
