
//An iterator is not a collection, but rather a way to access the elements of a collection one by one
//o basic operations on an iterator it are next and hasNext.
// it.next() will return the next element of the iterator and advance the state of the iterator. 
// find out whether there are more elements to return using Iterator's it.hasNext method.


object Example{
  def main(args: Array[String]){
    val it = Iterator("a", "number", "of", "words")
    while(it.hasNext){
      println(it.next())
    }

    //Finding Min, max , size and length of an iterator
    //
    //Here, we used ita and itb to perform two different operations because iterator can be
     //traversed only once.
    val ita = Iterator(20,40,2,50,69,90)
    val itb = Iterator(20,40,2,50,69,90)
    println("Maximum valued element " + ita.max)
    println("Minimum values element " + itb.min)
    println("size of ita : " + ita.size)
    println("length of itb : " + itb.length)
  }
}
