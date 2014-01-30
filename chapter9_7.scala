
val source = scala.io.Source.fromFile("myfile9_7.txt")
val tokens = source.mkString.split("\\s+")

println("kompletter Text:")
println(tokens.mkString(" "))

println("Wörter, die keine Zahlen sind:")
tokens.filterNot(_.matches("[-+]?[0-9]*\\.?[0-9]+")).foreach(println)
