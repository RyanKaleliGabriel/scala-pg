//Scala tuple combines a fixed number of items together so that they can be passed around as a whole. 
//Unlike an array or list, a tuple can hold objects with different types but they are also immutable.
//

object Example {
  def main(args: Array[String]){
    val t = (4,3,2,1)
    val sum = t._1 + t._2 + t._3 + t._3 +t._4
    println("Sum of elements: "+ sum)

    //Iterate
    t.productIterator.foreach{ i => println("Value = " + i)}


    //convert to string
    val newt = (1, "Hello", Console)
    println("Concatenated String: " + newt.toString())

    //Swap 
    val lastT = ("Scala", "Hello")
    println("Swapped Tuple: " + lastT.swap)
  }
}
