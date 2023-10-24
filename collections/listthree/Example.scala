//Creating uniform lists
//Tabulating a function
//Reverse list order

object Example{
  def main(args: Array[String]){
    //List.fill() method to creates a list consisting of zero or 
    //more copies of the same element.
    //Repeats apples three times
    val fruit = List.fill(3)("apples")
    println( "fruit : " + fruit)

    //Repeats 2, 10 times
    val num = List.fill(10)(2)
    println( "Num : " + num)


    //Tabulating a function
    val squares = List.tabulate(6)(n => n*n)
    println( "squares : " +squares)

    val mul = List.tabulate(4,5)(_*_)
    println( "mul : " +mul)


    //REverse list order
    val fruits = "apples" ::("oranges" :: ("pears" :: Nil))
    println( "After reverse fruit : " +fruits.reverse)
  }
}
