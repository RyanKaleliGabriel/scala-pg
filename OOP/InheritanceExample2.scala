import scala.io.StdIn.readLine
class Marks(val CAT1: Int, val CAT2: Int, val EXAM: Int){
  val cat1 = CAT1;
  val cat2 = CAT2;
  val exam = EXAM;
}

class Subject(override val CAT1: Int, override val CAT2: Int, override
  val EXAM: Int, var code: String, var name: String) extends Marks(CAT1,CAT2,EXAM){
    val sname = name;
    val scode = code;
    def result() = {
      var tcat = cat1+cat2
      var sum = cat1+cat2+exam
      val grd = if(sum >=70)
                  "A"
                else if(sum >=60)
                  "B"
                else if(sum >= 50)
                  "C"
                else if(sum>=40)
                  "D"
                else
                  "F"
      print(scode + "\t")
      print(cat1 + "\t")
      print(cat2 + "\t")
      print(tcat + "\t")
      print(exam + "\t")
      print(sum + "\t")
      print(grd)
    }
  }

  object InheritanceExample2 {
    def main(args: Array[String]) = {
      val c1 = scala.math.ceil(Math.random()*10).asInstanceOf[Int]
      val c2 = scala.math.ceil(Math.random()*20).asInstanceOf[Int]
      val ex = scala.math.ceil(Math.random()*70).asInstanceOf[Int]
      print("Enter the unit code: ")
      var unitcode = readLine()
      print("Enter the Unit name: ")
      var unitname = readLine()

      val subj = new Subject(c1, c2, ex, unitcode, unitname);
      subj.result();

  }
  }
