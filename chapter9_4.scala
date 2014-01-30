
val source = scala.io.Source.fromFile("myfile9_4.txt").mkString.split(" ").map(_.toDouble)

println(source.mkString(", "))
println("sum = " + source.sum)
println("average = " + source.sum / source.length)
println("maximum = " + source.max)
println("minimm = " + source.min)