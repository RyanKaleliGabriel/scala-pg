
// When you invoke a function, you're said to be applying the function to the arguments. 
// If you pass all the expected arguments, you have fully applied it.
// If you send only a few arguments, then you get back a partially applied function
// This gives you the convenience of binding some arguments and leaving the rest to be filled in later
//
//
// The goal is to eliminate the noise of passing the date to each call by partially applying that argument to the log( ) method.This can be achieved by binding a value to the date parameter and leave the second parameter unbound by putting an underscore at its place.
import java.util.Date
object partialApplied{
  def main(args: Array[String]){
    val date = new Date
    val logWithDateBound = log(date, _ : String);
    logWithDateBound("message1")
    Thread.sleep(1000)
    logWithDateBound("message2")
    Thread.sleep(1000)
    logWithDateBound("message3")
  }

  def log(date: Date, message: String) = {
    println(date + "---" + message)
  }
}

