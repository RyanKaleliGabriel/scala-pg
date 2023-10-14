object MySingleton {
  def sayHello() {
    println("Hello from MySingleton")
  }
  val constantValue = 42
}
object singleton {
  def main(args: Array[String]) = {
    MySingleton.sayHello()
    val value = MySingleton.constantValue
    println(value)
  }
}
