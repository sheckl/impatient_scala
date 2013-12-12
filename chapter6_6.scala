
object cardSuits extends Enumeration {
  type cardSuits = Value
  val Kreuz = Value("♣")
  val Karo = Value("♦")
  val Herz = Value("♥")
  val Pik = Value("♠")
}

for (c <- cardSuits.values) println(c.id + ": " + c)
