trait Speaker {
  def speak(): String
}
trait TailWagger {
  def startTail(): Unit= println("Tail is wagging")
  def stopTail(): Unit = println("Tail is stopped")
}

trait Runner {
  def startRunning(): Unit = println("I'm running")
  def stopRunning(): Unit = println("I've stopped running")
}

class Dog extends Speaker with TailWagger with Runner {
  def speak(): String = "Woof!"
}

class Cat extends Speaker with TailWagger with Runner {
  def speak(): String = "MEOW!"

  override def startRunning(): Unit = println("Yeah..I don't run")
  override def stopRunning(): Unit = println("No need to stop")
}

object mixBehaviour{
  def main(args: Array[String]){
    val dog = new Dog
    println(dog.speak)
    dog.startRunning()
    dog.startTail()

    val cat = new Cat
    println(cat.speak)
    cat.startRunning
    cat.stopRunning

  }
}
