import scala.util.Random

// Exercise 1

def randomArray(n: Int) = {
  val a = new Array[Int](n)
  for (i <- 0 until n) {
    a(i) = Random.nextInt(n)
  }
  a
}

println(randomArray(10).mkString(", "))

// shorter version:
val n = 10
val randoms = for (i <- 0 until n) yield Random.nextInt(n)
println(randoms.toArray.mkString(", "))


// Exercise 2

def swapElements(a: Array[Int]) = {
  for (i <- 0 until a.length) {
    if (i % 2 == 0 & i < a.length - 1) {
      val firstNumber = a(i)
      a(i) = a(i + 1)
      a(i + 1) = firstNumber
    }
  }
  a
}

val b = Array(1, 2, 3, 4, 5)
println("new Array: " + swapElements(b).mkString(", "))


// Exercise 3

def swapElementsYield(a: Array[Int]) = {
  val newArray: Array[Int] = for (i <- 0 until a.length) yield {
    if (i % 2 == 0 & i == a.length - 1) a(i)
    else if (i % 2 == 0) a(i + 1)
    else a(i - 1)
  }
  newArray
}

val c = Array(1, 2, 3, 4, 5)
println("new array created with yield: " + swapElementsYield(c).mkString(", "))

// shorter version:
// val in = Array(1, 2, 3, 4, 5)
// val out = (for(a <- in.grouped(2)) yield a.reverse).flatten
// println(out.mkString("|"))
// in.grouped teilt das Array in 2er Gruppen ein, die dann jeweils durch reverse umgedreht werden
// das ergibt eine Reihe von 2er Arrays, die durch flatten wieder zusammengebracht werden



// Exercise 4

import scala.collection.mutable.ArrayBuffer

def orderArray(a: Array[Int]) = {
  val positiveElements = for (elem <- a if elem > 0) yield elem
  val negativeElements = for (elem <- a if elem <= 0) yield elem
  val newArray = positiveElements ++ negativeElements
  newArray
}

val d = Array(1, -5, 9, -10, 2, 3)
println("ordered array: " + orderArray(d).mkString(", "))

// shorter version:
// val in = Array(1, 2, -3, 4, -5)
// val out = in.filter(_ > 0) ++ in.filter(_< 0)
// println(out.mkString("|"))



// Exercise 5

val f = Array(1.2, 2.8, 3.1, 4.6, 5.5)
val fAverage = f.sum / f.length
println(fAverage)


// Exercise 6

val g = Array(1, 2, 3, 4, 5)
println(g.reverse.mkString(", "))
println(g.sortWith(_ > _).mkString(", "))

val h = ArrayBuffer(1, 2, 3, 4, 5)
println(h.sortWith(_ > _).mkString(", "))


// Exercise 7

val array = Array(1,2,1,3,4,4,2)
println("array without duplicates: " + array.distinct.mkString(", "))


// Exercise 8

import scala.collection.mutable.ArrayBuffer

// first example 3.4
/*
var first = true
var n = a.length
var i = 0
while (i < n) {
  if (a(i) >= 0) i += 1
  else {
    if (first) { first = false; i += 1 }
    else { a.remove(i); n -= 1 }
  }
}
*/

// second example 3.4
/*
var first = true
val indexes = for (i <- 0 until a.length if first || a(i) >= 0) yield {
  if (a(i) < 0) first = false; i
}
for (j <- 0 until indexes.length) a(j) = a(indexes(j))
a.trimEnd(a.length - indexes.length)
*/

// exercise version
def RemoveNegativeElements(a: ArrayBuffer[Int]) = {
  val IndexNegativeNumbers = for (i <- 0 until a.length if a(i) < 0) yield i
  val IndexesToKeep = IndexNegativeNumbers.reverse.dropRight(1)
  for (i <- IndexesToKeep) a.remove(i)
  a
}

val a = ArrayBuffer(3, 7, -4, 8, -2, 7, 3, -6)
println(RemoveNegativeElements(a).mkString(", "))


// Exercise 9

val timezones = java.util.TimeZone.getAvailableIDs
val timezonesAmerica = for (elem <- timezones if elem.startsWith("America")) yield elem.stripPrefix("America/")
val timezonesAmericaSorted = timezonesAmerica.sorted



























