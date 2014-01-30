
val out = new java.io.PrintWriter("myfile9_5.txt")

for (i <- 0 to 20) {
  println("%f         %f".format(math.pow(2, i), math.pow(2, -i)))
}