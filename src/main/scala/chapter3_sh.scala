
// Exercise 1

val n = 4
val b = new Array[Int](n)



// Exercise 2

val a = Array(1, 2, 3, 4, 5)

for (i <- 0 until (a.length,2)) {
  if (i < a.length -1) {
    var arraySlice = a.slice(i, i + 2).reverse
    a(i) = arraySlice(0)
    a(i + 1) = arraySlice(1)
  }
  a
}

println(a.mkString(", "))





