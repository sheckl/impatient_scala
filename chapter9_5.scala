
val out = new java.io.PrintWriter("myfile9_5.txt")

for (i <- 0 to 20) {
  println(math.pow(2, i).toInt.toString.padTo(10, ' ') + "\t" + math.pow(2, -i))
}

//Hinweis: pow(2,..) wird zweimal berechnet
//besser: in Variable speichern (macht das Skript schneller)