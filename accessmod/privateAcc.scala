//Members marked as private are only accessible within the class or object that contains them. Subclasses cannot access private members.
class MyClass{
  //This field and method are private
  private val privateField = 20;

  private def privateMethod(): Unit = {
    println("This is a private method")
  }
}

object privateAcc{
  def main(args: Array[String]) = {
    val obj = new MyClass

    //Accessing the methods and fields will cause an error
    println(obj.privateField)
    obj.privateMethod()
  }
}
