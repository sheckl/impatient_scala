
def indexes2(word: String) = {
  var result = scala.collection.immutable.Map[Char, scala.collection.mutable.LinkedList[Int]]()

  for ((letter, index) <- word.zipWithIndex) {
    val set = result.getOrElse(letter.toChar, scala.collection.mutable.LinkedList[Int]())
    set :+ index
    result = result + (letter -> set)
  }

  result
}

println(indexes2("Mississippi"))

