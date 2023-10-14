class Marks(var CAT1: Int = 10, var CAT2: Int = 15, var EXAM: Int=45){
  var sum = CAT1+CAT2+EXAM;
  override def toString = s"Cat1: $CAT1, Cat2: $CAT2, Exam: $EXAM, Total: $sum";
}

object defaultConstructor{
  def main(args: Array[String]) = {
    var std1 = new Marks();
    println(std1)
  }
}
