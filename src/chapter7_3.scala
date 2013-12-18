
package object random {

  private var previous = 123.4

  def nextInt(): Int = {
    nextDouble().toInt
  }

  def nextDouble(): Double = {
    previous = (previous * 1664525 + 1013904223) % Math.pow(2,32)
    previous
  }

  def setSeed(seed: Int) {
    previous = seed
  }

}

object RandomNumber extends App {
  random.setSeed(8923649)
  println(random.nextDouble())
  println(random.nextDouble())
  println(random.nextInt())
  println(random.nextInt())
}

