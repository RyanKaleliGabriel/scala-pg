//Using for expression on maps

object example{
  def main(args: Array[String]){
    val ratings = Map("James"->40, "Jane"->50, "Joseph"->70)
    for((name, rating) <-ratings)
      println(s"Movie: $name, Rating: $rating")
  }
}
