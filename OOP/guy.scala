import scala.io.StdIn.readLine
class Person(var firstName: String, var lastName: String){
  println("The constructor begins")
  //public access by default
  print("Enter the person's age: \n")
  var age = readLine()
  //some class fields
  private val HOME = System.getProperty("user.home")
  //some methods
  override def toString(): String = s"$firstName $lastName is $age years old"
  def printHome(): Unit = println(s"HOME = $HOME")
  def printFullName(): Unit = println(this)
  printHome()
  printFullName()
  println("You have reached the end of the constructor")
}

object guy{
  def main(args: Array[String]){
    var guy1 = new Person("Ryan", "Kaleli")
    var guy2 = new Person("Vanessa", "Omondi")
    var guy3 = new Person("Fidel", "Otieno")
  }
}
