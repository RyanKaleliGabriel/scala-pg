//To Illustrate the use of if..else if..else in Imperative Style
object ifElseIfElse {
  def main(args: Array[String]) = {
    var x = Math.ceil(Math.random()*100);
    if(x>=70)
      println(x+": A")
    else if(x>=60)
      println(x+": B")
    else if(x>=50)
      println(x+": C")
    else if(x>=40)
      println(x+": D")
    else
      println(x+": F")
  }
}
