
val source = scala.io.Source.fromFile("myfile9_6.txt").mkString

val quotations = """"([^"]*)"""".r

for (quotations(elem) <- quotations.findAllIn(source)) println(elem)