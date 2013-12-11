import java.awt.Point

class Point private (val xValue: Int, val yValue: Int) {
  private var x = xValue
  private var y = yValue
  def getCoordinates = (x, y)
}

object Point {
  def apply(xValue: Int, yValue: Int) = new Point(xValue, yValue)
}

val newPoint = Point(3, 4)
println("Coordinates: " + newPoint.getCoordinates)
