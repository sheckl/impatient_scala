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

// kürzere Variante:
// val randoms = for(i <- 1 until n) yield Random.nextInt(n)

// Exercise 2

val b = Array(1, 2, 3, 4, 5)

for (i <- 0 until (b.length,2)) {
  if (i < b.length - 1) {
    var arraySlice = b.slice(i, i + 2).reverse
    b(i) = arraySlice(0)
    b(i + 1) = arraySlice(1)
  }
  b
}

println(b.mkString(", "))

// Exercise 3



// Exercise 4

val d = Array(2, 3, -5, 6, -8, 1)

val indexes_positive = for (i <- 0 until d.length) yield