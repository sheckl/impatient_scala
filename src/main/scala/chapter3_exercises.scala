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
val in = Array(1, 2, 3, 4, 5)
val out = (for(a <- in.grouped(2)) yield a.reverse).flatten
println(out.mkString("|"))
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





































