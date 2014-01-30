
println(scala.io.Source.fromFile("myfile9_3.txt").mkString.split("\\s+").filter(_.length > 12).mkString(", "))