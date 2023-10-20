abstract class Pet (name: String) {
  def sayName(): Unit = println(s"My name is $name")
  def speak(): Unit = println("Yo")
  def comeToMaster() = println("Here I  come")
}

class Dog(name: String) extends Pet(name) {
  //The name constructor parameter is passed from the Dog class constructor to the
  //Pet constructor
  override def speak(): Unit = println("Woof!")
}

object ExampleOne{
  def main(args: Array[String]){
    val dog = new Dog("Oreo")

    dog.sayName
    dog.speak
    dog.comeToMaster
  }
}
