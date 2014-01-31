//wie 13_1, nur mit immutable map (Char -> List)


def indexes(word: String) = {
  val result = Map[Char, List[Int]]()

  for ((letter, index) <- word.zipWithIndex) {
    val set = result.getOrElse(letter.toChar, new List[Int])
    set :: index
    result(letter) = set
  }

  result
}

println(indexes("Mississippi"))

