import scala.collection.mutable.ArrayBuffer
object Example{
  def main(args: Array[String]){
    val a = ArrayBuffer.range('a', 'h')
    println("Initial arraybuffer a = " +a)
    a.remove(0)
    println("Remove index 0  = " +a)
    //removes 3 elements starting at index 2
    a.remove(2,3)
    println("Remove (2,3) = " +a)

    val b = ArrayBuffer.range('a', 'h')
    println("Initial arraybuffer b =" +b)
    b.trimStart(2)
    println("Trimstart(2) = "+b)
    b.trimEnd(2)
    println("Trimend(2) = "+b)

  }
}
