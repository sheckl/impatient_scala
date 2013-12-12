
object cardSuits extends Enumeration {
  type cardSuits = Value
  val Kreuz = Value("♣")
  val Karo = Value("♦")
  val Herz = Value("♥")
  val Pik = Value("♠")
}

import cardSuits._

def isRed(cardSuit: cardSuits) = cardSuit == Karo || cardSuit == Herz

for (c <- cardSuits.values) println(c + " is red: " + isRed(c))

WeekDay.values filter isWorkingDay foreach println
