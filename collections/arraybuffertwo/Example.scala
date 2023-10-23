//Creating an array with initial elements

import scala.collection.mutable.ArrayBuffer

object Example{
  def main(args: Array[String]){
    val nums = ArrayBuffer[Int](1,2,3)
    //Add one element
    println(s"Initial arraybuffer =" +nums)
    nums += 4
    println(s"Adding 4 = " +nums)
    //Add multiple elements
    nums +=5 +=6
    println(s"Adding 5 and 6 = " +nums)
    // add multiple elements from another collection
    nums ++= List(7,8,9)
    println(s"Adding 7, 8 and 9 = " +nums)

    //remove elements from an ArrayBuffer
    nums -= 9
    println(s"Removing 9 = " +nums)

    //remove multiple elements
    nums -=7 -=8
    println(s"Removing 7, 8 = " +nums)

    //remove using another collection
    nums --= Array(5,6)
    println(s"Removing 5 and 6 =" +nums)

  }
}
