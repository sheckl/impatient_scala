
object CardSuits extends Enumeration {
  val Kreuz = Value("♣")
  val Karo = Value("♦")
  val Herz = Value("♥")
  val Pik = Value("♠")
}

import CardSuits._

def isRed(cardSuit: CardSuits.Value) = {
  cardSuit == Karo || cardSuit == Herz
}

for (c <- CardSuits.values) println(c + " is red: " + isRed(c))

// Statt CardSuits.Value könnte auch type CardSuits=Value geschrieben werden
// wir machen das aber erstmal nicht