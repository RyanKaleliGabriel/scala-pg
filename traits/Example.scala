//In Scala, traits are a fundamental concept used for creating modular and reusable components in your code. Traits are similar to interfaces in other languages but can also contain concrete methods and fields.


trait TailWagger {
  def startTail(): Unit
  def stopTail(): Unit
}

class Dog extends TailWagger{
  def startTail() = println("Tail is Wagging")
  def stopTail() = println("Tail is stopped")
}

object Example{
  def main(args: Array[String]){
    val dog = new Dog

    dog.startTail()
    dog.stopTail()
  }
}
