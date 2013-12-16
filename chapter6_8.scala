
object rgbColorCube extends Enumeration {
  val white = Value(0xffffff)
  val red = Value(0x0000ff)
  val green = Value(0x00ff00)
  val blue = Value(0xff0000)
  val cyan = Value(0xffff00)
  val magenta = Value(0xff00ff)
  val yellow = Value(0x00ffff)
  val black = Value(0x000000)
}

for (c <- rgbColorCube.values) println(c.id + ": " + c)
// Hier wird das Ergebnis nicht als Int sondern als Hexadezimal ausgegeben:
for(c <- rgbColorCube.values) println("0x%06x: %s".format(c.id, c))
// oder über printf:
for(c <- rgbColorCube.values) printf("0x%06x: %s \n", c.id, c)

