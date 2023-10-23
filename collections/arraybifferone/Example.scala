//ArrayBuffer an indexed, mutable sequence
//
//How to add elements in an empty arrayBuffer
import scala.collection.mutable.ArrayBuffer
object Example{
  def main(args: Array[String]){
    val ints = ArrayBuffer[Int]()
    ints += 1
    println(ints)
    ints +=2
    println(ints)
  }
}
