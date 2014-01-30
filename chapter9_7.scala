
val source = scala.io.Source.fromFile("myfile9_7.txt")
val tokens = source.mkString

println("kompletter Text:")
println(tokens)

//val floatPointPattern = """[-+]?[0-9]*\.?[0-9]+""".r
val floatPointPattern = """[^0-9.]*""".r
val matches = floatPointPattern.findAllIn(tokens).toArray

println("Text ohne Zahlen:")
println(matches.mkString(" "))

/*
val out = new java.io.PrintWriter("myfile9_7_b.txt")
out.println(matches.mkString(" "))
out.close()
*/