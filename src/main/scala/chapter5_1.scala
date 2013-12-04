
class Counter {
  private var value = 0 //2147483645 //Int.MaxValue = 2147483647
  def increment() { if (value < Int.MaxValue) value += 1 }
  def current() = value
}

val myCounter = new Counter
myCounter.increment()
myCounter.current()
