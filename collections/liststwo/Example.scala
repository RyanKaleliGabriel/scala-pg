object Example{
  def main(args: Array[String]){
    val fruit1 = "apples" :: ("orange" :: ("pears" :: Nil))
    val fruit2 = "mangoes" :: ("banana" :: Nil)

    //use two or more lists with ::: operator
    var fruit = fruit1 ::: fruit2
    println( "fruit1 ::: fruit2 : " +fruit)

    //use two lists with set .:::() method
    fruit = fruit.:::(fruit2)
    println( "fruit1.:::(fruit2) : " +  fruit)

    //pass two or more lists are arguements
    fruit = List.concat(fruit1, fruit2)
    println( "List.concat(fruit1, fruit2) : " + fruit)
  }
}
