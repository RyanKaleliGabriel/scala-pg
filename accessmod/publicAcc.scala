// Members that are not explicitly marked with any access modifier are considered public. They are accessible from anywhere.

class MyClass {
  // this field and method are public by default
  val publicField = 42
  def publicMethod():Unit = {
    println("This is a public method")
  }
}

object publicAcc {
  def main(args: Array[String]) = {
    val obj = new MyClass

    //Accessing public field and method
    
    println(obj.publicField)
    obj.publicMethod()
  }
}
