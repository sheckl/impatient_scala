
class Point private (val xValue: Int, val yValue: Int) {
  def getCoordinates = (xValue, yValue)
}

object Point {
  def apply(xValue: Int, yValue: Int) = new Point(xValue, yValue)
}

val newPoint = Point(3, 4)
println("Coordinates: " + newPoint.getCoordinates)
