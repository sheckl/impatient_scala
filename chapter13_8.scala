
val input = Array(1, 2, 3, 4, 5, 6)

println(input.mkString(", "))

def splitArray(a: Array[Int], n: Int) = {
  a.grouped(n).toArray
}

println(splitArray(input, 3).mkString(" and "))