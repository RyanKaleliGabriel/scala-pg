trait TailWagger {
  def startTail(): Unit
  def stopTail(): Unit
}
trait Speaker{
  def speak(): String
}
trait Runner{
  def startRunning(): Unit
  def stopRunning(): Unit
}

trait Pet{
  def speak(): Unit = println("YO")
  def comeToMaster(): Unit
}

class Dog extends TailWagger with Speaker with Runner{
  //Speaker
  def speak(): String =  "Woof!"

  //TailWagger
  def startTail(): Unit = println("Tail is wagging")
  def stopTail(): Unit = println("Tail has stopped wagging")

  //Runner
  def startRunning(): Unit = println("I'm running")
  def stopRunning(): Unit = println("Stopped running")

}

//overriding an implemented method

class Cat extends Pet{
  //override speak
  override def speak(): Unit = println("Meow")
  def comeToMaster(): Unit = println("No not me")
}

object withExample{
  def main(args: Array[String]){
    val dog = new Dog
    val cat = new Cat
    println(dog.speak())
    println(cat.speak())

    dog.startRunning()
    dog.startTail()
    cat.comeToMaster()

    dog.stopTail()
    dog.stopRunning()
  }
}
