//To illustrate the use of if..else if..else in functional style

object ifElseIfElseFunc {
  def main(args: Array[String]) = {
    val x = Math.ceil(Math.random()*100);
    val grd = if(x>=70) x+": A"
              else if(x>=60) x+": B"
              else if(x>=50) x+": C"
              else if(x>=40) x+": D"
              else x+": F"
              println(grd)
  }
}

