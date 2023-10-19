//Protected Modifier methods and fields cannot be accessed outside the class
//Methods and fields however can be accessed in the subclass of the super class


class MySuperClass{
  //Protected Field
  protected val protectedValue = 67

  //Protected Methods

  protected def protectedMethod(): Unit =  {
    println("This is a protected Method")
  }
}

class MySubClass extends MySuperClass {
  //Protected methods and fields can be accessed from the subclass and the super class
  def AccessProtectedMembers(): Unit = {
    println(protectedValue)
    protectedMethod()
  }
}

object protectedAcc{
  def main(args: Array[String]){
    //Accessing from the subclass will run
    val obj = new MySubClass
    obj.AccessProtectedMembers()



    //Accessing from the super class will cause an error
    //new obj = new MySuperClass
    //println(obj.protectedValue)
    //obj.protectedMethod()

  }
}
