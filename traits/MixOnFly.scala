trait TailWagger {
  def startTail(): Unit = println("Tail is wagging")
  def stopTail(): Unit = println("Tail is stopped")
}

trait Runner{
  def startRunning(): Unit = println("I'm running")
  def stopRunning(): Unit = println("Stopped Running")
}

class Dog(name: String)

object MixOnFly{
  def main(args: Array[String]){
    val dog = new Dog("Oreo") with TailWagger with Runner
    dog.startRunning
    dog.startTail()
    dog.stopTail()
    dog.stopRunning
  }
}
