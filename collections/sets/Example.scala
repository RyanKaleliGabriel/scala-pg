//a Set is a collection that contains no duplicate elements. 
//

object Example{
  def main(args: Array[String]){
    val fruit = Set("apples", "oranges", "pears")
    val numbers: Set[Int] = Set()
    println( "Head of fruit : " + fruit.head)
    println( "Tail of fruit : " + fruit.tail)
    println( "Check if fruit is empty : "+ fruit.isEmpty)
    println( "Check if numbers is empty : " + numbers.isEmpty)



    //Concatenating sets
    //
    val fruit1 = Set("apples", "oranges", "pears")
    val fruit2 = Set("mangoes", "banana")

    var fruitn = fruit1 ++ fruit2
    println( "fruit1 ++ fruit2 : " + fruitn)

    fruitn = fruit1.++(fruit2)
    println("fruit1.++(fruit2) : " + fruitn)


    //Find max, min Elements in a set
    //
    val num = Set(5,6,9,20,30,45)
    println( "Min element in num is : "+ num.min)
    println( "Max element is num is : "+num.max)


    //finding common values in sets
    val num1 = Set(5,6,9,20,30,45)
    val num2 = Set(50,60,9,20,35,55)
    println( "num1.&(num2) : " +num1.&(num2))
    println( "num1.intersect(num2) : " + num1.intersect(num2))
  }
}
