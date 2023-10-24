//Scala map is a collection of key/value pairs. 
//Any value can be retrieved based on its key.
//Keys are unique in the Map, but values need not be unique.
//Maps are also called Hash tables.

object Example{
  def main(args: Array[String]){
    val colors = Map("red" -> "#FF0000", "azure"->"#F0FFFF", "peru"->"#CD853F")
    val nums : Map[Int, Int] = Map()
    println("Keys in colors : " + colors.keys)
    println("Values in colors : " + colors.values)
    println("Check if colors is empty : " +colors.isEmpty)
    println( "Check if nums is empty : " + nums.isEmpty)

    //Concatenating
    val colors1 = Map("red" -> "#FF0000", "azure" -> "#F0FFFF", "peru" -> "#CD853F")
    val colors2 = Map("blue" -> "#0033FF", "yellow" -> "#FFFF00", "red" -> "#FF0000")
    var colorsn = colors1 ++ colors2
    println("colors1++colors2 : " + colorsn)
    var colors3 = colors1.++(colors2)
    println("colors1.++(colors2) : " + colors3)



    //Print keys and values
    colorsn.keys.foreach{ i => 
      println("Key = " +i)
      println("Value = " + colorsn(i))
    }

    //Check for a key in a map

    if(colorsn.contains("red")){
      println("Red key exists with value : " + colorsn("red"))
    }else{
      println("Red key does not exist")
    }
    if(colorsn.contains("Maroon")){
      println("Maroon key exists with value : " + colorsn("maroon"))
    }else{
      println("Marron key does not exist")
    }
  }
}
