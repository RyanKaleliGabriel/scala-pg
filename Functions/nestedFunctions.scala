
object nestedFunctions{
  def main(args: Array[String]){
    printResults(45,25,30,50,23,60,76,49,52);
  }

  def printResults(args:Int*) = {
    var i: Int =0;
    for(mark <- args){
      println("Mark value[" + i + "] = " + mark + " Grade = "+grade(mark));
      i = i + 1
    }
    // A nested function to return the grade for a given marks
    def grade(mark:Int): String = {
      if(mark >= 70)
        "A"
      else if(mark >= 60)
        "B"
      else if(mark >= 50)
        "C"
      else if(mark >= 40)
        "D"
      else
        "F"
    }
  }
}
