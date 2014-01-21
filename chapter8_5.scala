
class Point(val x: Int, val y: Int)

class LabeledPoint(val label: String, x: Int, y: Int) extends Point(x, y)  {
  def pointLabel = label
}

val a = new Point(1, 1)
println(a.x, a.y)

val b = new LabeledPoint("Some point", 20, 50)
println(b.label, b.x, b.y)


