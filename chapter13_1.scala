import scala.collection.mutable

def indexes(word: String) = {
  val result = Map[Char, mutable.LinkedHashSet[Int]]()

  for ((letter, index) <- word.zipWithIndex) {
    val set = result.getOrElse(letter.toChar,new mutable.LinkedHashSet[Int])
    set += index
    result(letter) = set
  }

  result
}

println(indexes("Mississippi"))
