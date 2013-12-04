
// exercise 1

val gizmos = Map("A" -> 200.0, "B" -> 35.0, "C" -> 112.3)
val gizmosWithDiscount = for((k,v) <- gizmos) yield (k, v * 0.9)
println(gizmosWithDiscount)
// Typangabe kann man sich sparen, wenn der Typ überall gleich ist
// wenn man .0 weglässt, macht er den allgemeinen Typ AnyVal draus


// exercise 2

val firstFile = new java.util.Scanner(new java.io.File("myfile.txt"))

def CountWordsInFile(file: java.util.Scanner) = {
  val countWords = scala.collection.mutable.Map[String, Int]()
  while(file.hasNext()) {
    val nextWord = file.next()
    //if (countWords.contains(nextWord)) countWords(nextWord) += 1 else countWords(nextWord) = 1
    countWords(nextWord) = countWords.getOrElse(nextWord, 0) + 1
  }
  countWords
}

println(CountWordsInFile(firstFile))


// exercise 3

val secondFile = new java.util.Scanner(new java.io.File("myfile.txt"))

def CountWordsInFileImmutable(file: java.util.Scanner) = {
  var countWords = Map[String, Int]()
  while(file.hasNext()) {
    val nextWord = file.next()
    if (countWords.contains(nextWord)) {
      val newNumber = countWords(nextWord) + 1
      countWords += (nextWord -> newNumber)
    } else {
      countWords += (nextWord -> 1)
    }
  }
  countWords
}

println(CountWordsInFileImmutable(secondFile))


// exercise 4

val file = new java.util.Scanner(new java.io.File("myfile.txt"))

var countWordsThree = scala.collection.immutable.SortedMap[String, Int]()
while(file.hasNext()) {
  val nextWord = file.next()
  if (countWordsThree.contains(nextWord)) {
    val newNumber = countWordsThree(nextWord) + 1
    countWordsThree += (nextWord -> newNumber)
  } else {
    countWordsThree += (nextWord -> 1)
  }
}

println(countWordsThree)



// exercise 6

val days = scala.collection.mutable.LinkedHashMap("Monday" -> java.util.Calendar.MONDAY,
                                                  "Tuesday" -> java.util.Calendar.TUESDAY,
                                                  "Wednesday" -> java.util.Calendar.WEDNESDAY,
                                                  "Thursday" -> java.util.Calendar.THURSDAY,
                                                  "Friday" -> java.util.Calendar.FRIDAY,
                                                  "Saturday" -> java.util.Calendar.SATURDAY,
                                                  "Sunday" -> java.util.Calendar.SUNDAY
)

println(days)
// bei HashMap ist die Reihenfolge irgendwie, nicht Mon-Sun sortiert




// exercise 7

import scala.collection.JavaConversions.propertiesAsScalaMap
val props: scala.collection.Map[String, String] = System.getProperties

val lengths = for (v <- props.keySet) yield v.length
val maxLength = lengths.max

for ((k, v) <- props) {
  //printf("%s %s| %s\n", k, " "*(maxLength - k.length), v)
  printf("%s | %s\n", k.padTo(maxLength, ' '), v)
}



// exercise 8

def minmax(values: Array[Int]) = {
  val minmax = (values.min, values.max)
  minmax
}

val a = Array(2,3,4,5,6,14)
println("minimum and maximum of the array: " + minmax(a))



// exercise 9

def lteqgt(values: Array[Int], v: Int) = {
  val lteqgt = (values.count(_ < v), values.count(_ == v), values.count(_ > v))
  lteqgt
}

// Problem: hier muss dreimal iteriert werden
// dreimal count vermeiden!

val b = Array(1,2,3,4,5,6,6,7,7,8,10)
println("lower than, equal, greater than: " + lteqgt(b, 6))



def lteqgt2(values: Array[Int], v: Int) = {
  var lower = 0
  var equal = 0
  var greater = 0
  for (elem <- values) {
    if (elem < v) {
      lower += 1
    } else if (elem == v) {
        equal += 1
      } else
        greater += 1
  }
  (lower, equal, greater)
}

val c = Array(1,2,3,4,5,6,6,7,7,8,10)
println("lower than, equal, greater than: " + lteqgt2(c, 6))


/*
def lteqgt(values: Array[Int], v: Int) = {
  values.foldLeft((0, 0, 0)) { (res, value) =>
    if (value < v ) {
      (res._1 + 1, res._2, res._3)
    } else if (value == v) {
      (res._1, res._2 + 1, res._3)
    } else {
      (res._1, res._2, res._3 + 1)
    }
  }
}

println(lteqgt(Array(1, 2, 3, 4, 5, 6), 3))
*/


// exercise 10

"Hello".zip("World")
// scala.collection.immutable.IndexedSeq[(Char, Char)] = Vector((H,W), (e,o), (l,r), (l,l), (o,d))





