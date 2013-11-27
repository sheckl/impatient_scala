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
val randoms = for (i <- 1 until n) yield Random.nextInt(n)
println(randoms.toArray.mkString(", "))


// Exercise 2

val b = Array(1, 2, 3, 4, 5)

for (i <- 0 until b.length) {
  if (i % 2 == 0 & i < b.length - 1) {
    var firstNumber = b(i)
    b(i) = b(i + 1)
    b(i + 1) = firstNumber
  }
  b
}

println(b.mkString(", "))


// Exercise 3

val c = Array(1, 2, 3, 4, 5)

val newArray = for (i <- 0 until c.length) yield {
  if (i % 2 == 0 & i == c.length - 1) c(i)
  else if (i % 2 == 0) c(i + 1)
  else c(i - 1)
}

println(newArray.mkString(", "))




