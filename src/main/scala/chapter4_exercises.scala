
// exercise 1

val gizmos = Map[String,Double]("A" -> 200, "B" -> 35, "C" -> 112.3)
val gizmosWithDiscount = for((k,v) <- gizmos) yield (k, v * 0.9)
println(gizmosWithDiscount)

// exercise 2

val firstFile = new java.util.Scanner(new java.io.File("myfile.txt"))

def CountWordsInFile(file: java.util.Scanner) = {
  val countWords = scala.collection.mutable.Map[String, Int]()
  while(file.hasNext()) {
    val nextWord = file.next()
    if (countWords.contains(nextWord)) countWords(nextWord) += 1 else countWords += (nextWord -> 1)
  }
  countWords
}

println(CountWordsInFile(firstFile))

// exercise 3

val file = new java.util.Scanner(new java.io.File("myfile.txt"))

var countWords = Map[String, Int]()
while(file.hasNext()) {
    val nextWord = file.next()
    if (countWords.contains(nextWord)) {
      val newNumber = countWords(nextWord) + 1
      countWords = countWords + (nextWord -> newNumber)
    } else {
      countWords += (nextWord -> 1)
    }
}

println(countWords)

/*
val secondFile = new java.util.Scanner(new java.io.File("myfile.txt"))

def CountWordsInFileImmutable(file: java.util.Scanner) {
  var countWords = Map[String, Int]()
  while(file.hasNext()) {
    val nextWord = file.next()
    if (countWords.contains(nextWord)) {
      val newNumber = countWords(nextWord) + 1
      countWords = countWords + (nextWord -> newNumber)
    } else {
      countWords += (nextWord -> 1)
    }
  }
  countWords
}

println(CountWordsInFileImmutable(secondFile))
*/




