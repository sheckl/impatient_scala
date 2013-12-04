
class Counter {
  private var value = Int.MaxValue - 1
  def increment() {
    if (value < Int.MaxValue) value += 1 else
    throw new IllegalStateException("x is bigger than Int.MaxValue")
  }
  def current() = value
}

val myCounter = new Counter
myCounter.increment()
println(myCounter.current())
//myCounter.increment()
