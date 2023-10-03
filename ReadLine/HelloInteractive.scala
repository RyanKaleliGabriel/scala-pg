
/* There are several ways to read command-line input, 
 * but the easiest way is to use the readLine
method in the scala.io.StdIn package.*/

import scala.io.StdIn.readLine
object HelloInteractive extends App {
  print("Enter your first name: ")
  val firstName = readLine()
  print("Enter  your last name: ")
  val lastName = readLine()
  println(s"Your name is $firstName $lastName")

}
