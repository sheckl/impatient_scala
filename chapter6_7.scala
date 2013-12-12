
object cardSuits extends Enumeration {
  type cardSuits = Value
  val Kreuz = Value("♣")
  val Karo = Value("♦")
  val Herz = Value("♥")
  val Pik = Value("♠")
  def isRed(cardSuit: Value) = { cardSuit == Karo || cardSuit == Herz }
}

for (c <- cardSuits.values) println(c.id + ": " + c)
for (c <- cardSuits.values) println(c + " is red: " + cardSuits.isRed(c))
