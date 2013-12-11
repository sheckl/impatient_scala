import java.awt.Point

// Point(3, 4) without new: Point class with companion object

class Point private (val xValue: Int, val yValue: Int) {}

object Point {
  def apply(xValue: Int, yValue: Int) = new Point(xValue, yValue)
}

Point(3, 4)
