
import java.awt.Rectangle

class Square(x : Int, y: Int, width: Int) extends Rectangle(x, y, width, width) {
  def this() = this(0, 0, 0)
  def this(width: Int) = this(0, 0, width)
}

val s = new Square(1,1,2)
println(s.x, s.y, s.width)

val s2 = new Square
println(s2.x, s2.y, s2.width)

val s3 = new Square(4)
println(s3.x, s3.y, s3.width)
