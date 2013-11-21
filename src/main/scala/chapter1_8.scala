// Ausfuehren mit: scala scr/main/scala/chapter1_8.scala (erst in den Ordner impatien_scala gehen)

// Hier wird die Anzahl der Bits durch den Benutzer in der Shell eingegeben (z.B. 100)
print("> ")
val bits = readInt()
val random = BigInt(bits, scala.util.Random)

//println(random.toString(36))

printf("Hier ist deine Zahl: %s.\n", random.toString(36))

//println(BigInt(100, scala.util.Random).toString(36))
