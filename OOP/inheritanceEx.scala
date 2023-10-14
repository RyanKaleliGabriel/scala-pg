import scala.io.StdIn.readLine
class Marks(val CAT1: Int, val CAT2: Int, val EXAM: Int){
  val cat1 = CAT1;
  val cat2 = CAT2;
  val exam = EXAM;
  def grade(total: Int) = {
    if(total >= 70)
      "A"
    else if(total >=60)
      "B"
    else if(total >=50)
      "C"
    else if(total >= 40)
      "D"
    else 
      "F"
  }
}
class Subject(override val CAT1: Int, override val CAT2: Int, override val EXAM:Int, 
  var code: String, var name: String) extends Marks(CAT1, CAT2, EXAM){
    val uname = name;
    val scode = code;
    var tcat = cat1+cat2;
    var sum = cat1+cat2+exam;
    def result() = {
      println("Unit name : "+ uname)
      println("Unit Code : "+ scode)
      println("Cat 1 = "+ cat1)
      println("Cat 2 = "+cat2)
      println("Total cat marks = " +tcat)
      println("Exam = "+exam)
      println("Total Sum = " +sum)
      println("Grade is : " +grade(sum)) 
    }
  }

  object InheritanceEx{
    def main(args: Array[String]) = {
      val c1 = scala.math.ceil(Math.random()*10).asInstanceOf[Int]
      val c2 = scala.math.ceil(Math.random()*20).asInstanceOf[Int]
      val ex = scala.math.ceil(Math.random()*70).asInstanceOf[Int]
      print("Enter the unit name: ")
      var unitname = readLine()
      print("Enter the unit code: ")
      var unitcode = readLine()

      val subj = new Subject(c1,c2,ex, unitcode, unitname)
      subj.result
    }
  }

