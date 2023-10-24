// All the elements of a list have the same type
// Lists are immutable
// Second, lists represent a linked list whereas arrays are flat.


object ListExample1{
  def main(args: Array[String]){
    val fruit = "apples" :: ("oranges" :: ("pears" :: Nil))
    val nums = Nil
    // Head method returns the first element of a list
    println( "Head of fruit : " + fruit.head)
    //Tail method returns a list cosisting of all elemnts except the first
    println( "Tail of fruit : " +fruit.tail)
    //Isempty method returns true if the list is empty otherwise false
    println( "Check if fruit is empty : " + fruit.isEmpty)
    println( "Check if nums is empty : " + nums.isEmpty)
  }
}
