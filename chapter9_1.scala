
val fileLines = scala.io.Source.fromFile("myfile.txt").getLines.toArray.reverse
val out = new java.io.PrintWriter("myfile9_1.txt")

for (l <- fileLines) {
  out.println(l)
}

out.close()