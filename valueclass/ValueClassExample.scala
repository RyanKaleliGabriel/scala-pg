// Value classes contain a primary costructor with exactly one val parameter
// Contains only one def method
// Cannot be extended by another class
// Created by extending another class (AnyVal)
// Are mainly used to optimize performance and memory

class Vcube(val x: Int) extends AnyVal{
  def cube() = x*x*x
}

object ValueClassExample{
  def main(args: Array[String]){
    val v = new Vcube(5)
    println(v.cube())
  }
}

