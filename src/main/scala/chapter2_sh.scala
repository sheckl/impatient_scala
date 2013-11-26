
// Exercise 1

def signum(num: Int) = {
  if (num > 0) 1
  else if (num < 0) -1
  else 0
}

for (i <- -2 to 2) {
  println("Signum(" + i + ") = " + signum(i))
}


// Exercise 2

// value of an empty block expression: (),
// type of an empty block expression: Unit

var empty_block = {}

// Exercise 3
// x = y = 1 geht nicht, weil y = 1 () ist und man will nicht, dass x gleich () ist.
// Wenn man x mit Unit initialisieren will (macht man aber eigentlich nicht!)

// Exercise 4

for (i <- 10 to 0 by -1) {
  print(s"$i ")
}

for (i <- (0 to 10).reverse) {
  print(s"$i ")
}

// Exercise 5

def countdown(n: Int) {
  for (i <- n to 0 by -1) {
    print(s"$i ")
  }
  println("")
}

for (i <- 1 to 5) {
  countdown(i)
}

// Exercise 6

var prod = 1L // statt prod: Long = 1
for (ch <- "Hello") {
  prod *= ch
}
println("product with for-loop: " + prod)

// Exercise 7

val ex_7 = "Hello".map(_.toLong).product
println("product without loop: " + ex_7)

// bei großen Datenmengen sinnvoller:
// "Hello".foldLeft(1L) {(product,c) => product * c}

// Exercise 8

def product(s: String) = {
  s.map(_.toLong).product
}

val product_value = product("Hello")
println("function product without loop: " + product_value)


// Exercise 9

def recursiveProduct (s: String): Long = {
  if (s.isEmpty) 1
  else s.head * recursiveProduct(s.tail)
}
println("recursive function product: " + recursiveProduct("Hello"))

// Exercise 10

def power (x: Int, n: Int): Int = {
  if (n == 0) 1
  else if (n > 0) {
    if ((n % 2) == 0) {
      val y = power(x, n / 2)
      y * y
    } else {
      x * power(x, n - 1)
    }
  } else {
    1 / power(x, -n)
  }
}

val x = 2
val n = 3
println(x + "^" + n + " = " + power(x=x, n=n))
























