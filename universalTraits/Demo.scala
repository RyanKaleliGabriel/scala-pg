//Universal traits is a trait that extends Any, and only has defs as members, and does no 
//initialization

trait Printable extends Any {
  def print(): Unit = println(this)
}
//To permit value classes to extends traits, universal traits are introduced 
//which extends for Any
//They allow basuc inheritance of methods for value classes, but they incur the overhead of
//allocation
class Wrapper(val underlying: Int) extends AnyVal with Printable

object Demo {
  def main(args: Array[String]) {
    val w = new Wrapper(3)
    w.print()
  }
}


