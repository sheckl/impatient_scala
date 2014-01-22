
class Point(val x: Int, val y: Int)

abstract class Shape {
  def centerPoint: Point
}

class Rectangle(val topLeft: Point, val bottomRight: Point) extends Shape {
  override val centerPoint = new Point( (bottomRight.x - topLeft.x) / 2, (topLeft.y - bottomRight.y) / 2 )
}

class Circle(override val centerPoint: Point, val radius: Int) extends Shape



val r = new Rectangle(new Point(0,10), new Point(10,0))
println(r.centerPoint.x, r.centerPoint.y)

val c = new Circle(new Point(7, 7), 10)
println(c.centerPoint.x, c.centerPoint.y, c.radius)

