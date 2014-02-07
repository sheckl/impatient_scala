
val prices = List(5.0, 20.0, 9.95)
val quantities = List(10, 2, 1)

println((prices zip quantities) map { p => p._1 * p._2 })

def mult = {
  (x: Double, y: Int) => x * y
}

println((prices zip quantities) map mult.tupled)
println((prices.zip(quantities)).map(mult.tupled))