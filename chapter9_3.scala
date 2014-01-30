
println(scala.io.Source.fromFile("myfile9_3.txt").mkString.split("\\s+").filter(_.length > 12).mkString(", "))

// eigentlich wollen wir aber nicht Code in eine Zeile schreiben ;)