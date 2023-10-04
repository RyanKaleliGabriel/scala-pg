
object callByName {
  def main(args: Array[String]) = {
    delayed(time());
  }

  def time() = {
    println("Getting time in nano seconds");
    System.nanoTime
  }
  def delayed(t: => Long) = {
    println("System now: "+ System.nanoTime);
    println ("In delayed method");
    println("Time Parameter now: " + t);
  }
}
